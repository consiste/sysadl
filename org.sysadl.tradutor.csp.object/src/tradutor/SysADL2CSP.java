package tradutor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.sysadl.ComponentDef;
import org.sysadl.ComponentUse;
import org.sysadl.CompositePortDef;
import org.sysadl.ConnectorBinding;
import org.sysadl.ConnectorUse;
import org.sysadl.Delegation;
import org.sysadl.ElementDef;
import org.sysadl.EnumLiteralValue;
import org.sysadl.Model;
import org.sysadl.Package;
import org.sysadl.PortUse;
import org.sysadl.SimplePortDef;
import org.sysadl.TypeUse;

public class SysADL2CSP {
	Model model;	
	Map<String, SimplePortDef> portsMap = new HashMap<String,SimplePortDef>();
	Map<String, String> portsChannelSimple = new HashMap<String,String>();
	Map<String,List<String>> portsChannelComposite = new HashMap<String,List<String>>();
	Map<String,List<String>> compositePorts = new HashMap<String,List<String>>(); 
	Map<PortUse, PortUse> delegations = new HashMap<PortUse, PortUse>();
	List<String> boundaryComp = new ArrayList<String>();
	
	String resultText = "";
	FileWriter arqResult;
	
	
	public SysADL2CSP(Model model) {
		this.model = model;
	}
	
	public void traduzir() {
		System.out.println("-- Tradução Iniciada ----");
		for(Package pkg : model.getPackages()) {
			if(pkg.getName().contains("SysADL.types")) {
				resultText += "\n\n -- TYPES\n";
				traduzirTypes(model.getPackages().get(0));
			}
			else if(pkg.getName().contains("Components")) {
				getDelegations(pkg);
				resultText += "\n\n -- CHANNELS\n";
				traduzirChannel(pkg);
				resultText += "\n\n -- CONFIG\n";
				traduzirConfigComponents(pkg);
				traduzirBoundaryComponentsDef(pkg);
				resultText += "\n\n -- COMPONENTS\n";
				traduzirComponents(pkg);
				resultText += "\n\n -- CONNECTORS\n";
				//traduzirConnectors(pkg);
			}
			else if(pkg.getName().contains("Ports")) {
				traduzirPortDef(pkg);
			}
		}
		makeCspArq();
		System.out.println(resultText);
	}
	
	private void getDelegations(Package pkg) {
		for(ElementDef obj : pkg.getDefinitions()) {
			if(obj instanceof ComponentDef) {
				if(((ComponentDef)obj).getComposite() != null) {
					for(Delegation delegation :((ComponentDef) obj).getComposite().getDelegations()) {
						System.out.println("Delegations: " + delegation.getSource().getName() +" -> "+ delegation.getDestination().getName());
						delegations.put(delegation.getSource(), delegation.getDestination());
					}
				}
			}
		}
	}
	
	private void traduzirComponents(Package pkg) {
		for(ElementDef obj : pkg.getDefinitions()) {
			if(obj instanceof ComponentDef) {
				if(!((ComponentDef) obj).isIsBoundary() && ((ComponentDef)obj).getComposite() != null) {
					String boundary = "";
					String notBoundary = "";
					for(ComponentUse comp : ((ComponentDef) obj).getComposite().getComponents()) {						
						if(boundaryComp.contains(comp.getDefinition().getName())) {	
							boundary += comp.getName()+"_"+comp.getDefinition().getName() + " = ";
							if(compositePorts.get(comp.getPorts().get(0).getDefinition().getName()) != null) {
								for(PortUse port : comp.getPorts()) {																	
									if(port.getName().contains("out")) { //trocar TODO
										boundary += "|~|" + comp.getPorts().get(0).getName() + ":" + 
												getTypeSimplePortFromComposite(true, compositePorts.get(port.getDefinition().getName()))  + 
												" @ " + getChannelFromCompositePort(true, portsChannelComposite.get(port.getName())) + "!" +
												comp.getPorts().get(0).getName();
									}																		
								}
								boundary += "->";
							}
							else {
								for(PortUse p : comp.getPorts()) {																		
									if(((SimplePortDef)p.getDefinition()).getFlowProperties().getLiteral().equals("out")) {
										boundary += "|~|" + p.getName() + ":" +  portsMap.get(p.getDefinition().getName()).getFlowType().getName() + 
												" @ " + portsChannelSimple.get(comp.getName()+"_"+p.getName()) + "!" + p.getName();
									}
									else {
										boundary += portsChannelSimple.get(comp.getName()+"_"+p.getName()) + 
												"?" + p.getDefinition().getName().toLowerCase();
									}
									boundary += "->";
								}								
							}
							boundary += comp.getName()+"_"+comp.getDefinition().getName() +"\n";
						}
						else {
							System.out.println(comp.getName());
							notBoundary += comp.getName()+"_"+comp.getDefinition().getName() + "=";							
							for(PortUse p : comp.getPorts()) {
								//if(!delegations.containsKey(p)) {
									if(p.getDefinition() instanceof SimplePortDef) {
										if(((SimplePortDef) p.getDefinition()).getFlowProperties().getLiteral().equals("in")) {
											notBoundary += portsChannelSimple.get(comp.getName()+"_"+p.getName()) + "?" + ((SimplePortDef) p.getDefinition()).getFlowType().getName().toLowerCase() + " -> \n"; 
										}
										else if(((SimplePortDef) p.getDefinition()).getFlowProperties().getLiteral().equals("out")) {
											notBoundary += portsChannelSimple.get(comp.getName()+"_"+p.getName()) + "!" + ((SimplePortDef) p.getDefinition()).getFlowType().getName().toLowerCase() + " -> \n"; 
										}
										if(p.equals(comp.getPorts().get(comp.getPorts().size()-1))) {
											notBoundary += comp.getName()+"_"+comp.getDefinition().getName() + "\n";
										}
									}
									else {
										for(PortUse cp : ((CompositePortDef) p.getDefinition()).getPorts()) {
											if(cp.getDefinition() instanceof SimplePortDef) {
												if(((SimplePortDef) cp.getDefinition()).getFlowProperties().getLiteral().equals("in")) {
													notBoundary += getChannelFromCompositePort(false, portsChannelComposite.get(p.getName())) + "?" + ((SimplePortDef) cp.getDefinition()).getFlowType().getName().toLowerCase() + "-> \n";
												}
												else if(((SimplePortDef) cp.getDefinition()).getFlowProperties().getLiteral().equals("out")) {
													notBoundary += getChannelFromCompositePort(true, portsChannelComposite.get(p.getName())) + "!" + ((SimplePortDef) cp.getDefinition()).getFlowType().getName().toLowerCase() + "-> \n";
												}
												if(cp.equals(((CompositePortDef) p.getDefinition()).getPorts().get(((CompositePortDef) p.getDefinition()).getPorts().size()-1))) {
													notBoundary += comp.getName()+"_"+comp.getDefinition().getName() + "\n";
												}
											}
										}									
									}
								//}
							}							
						}							
					}					
					resultText += boundary;
					resultText += notBoundary;
				}
			}
		}
		
	}
	
	private String getTypeSimplePortFromComposite(boolean isOut, List<String> listSubPortsComp) {
		if(isOut) {
			for(String p : listSubPortsComp) {
				if(portsMap.get(p).getFlowProperties().getLiteral().equals("out")) {
					return portsMap.get(p).getFlowType().getName();
				}
			}
		}
		else {
			for(String p : listSubPortsComp) {
				if(portsMap.get(p).getFlowProperties().getLiteral().equals("in")) {
					return portsMap.get(p).getFlowType().getName();
				}
			}
		}
		return "???";
	}
	
	private String getChannelFromCompositePort(boolean isOut, List<String> listSubChannel) {
		if(isOut) {
			for(String ch : listSubChannel) {
				String[] aux = ch.split("_");
				if(portsMap.get(aux[aux.length-1]).getFlowProperties().getLiteral().equals("out")) {
					return ch;
				}
			}
		}
		else {
			for(String ch : listSubChannel) {
				String[] aux = ch.split("_");
				if(portsMap.get(aux[aux.length-1]).getFlowProperties().getLiteral().equals("in")) {
					return ch;
				}
			}
		}
		return "???";
	}

	private void traduzirBoundaryComponentsDef(Package pkg) {
		for(ElementDef obj : pkg.getDefinitions()) {
			if(obj instanceof ComponentDef) {
				if(((ComponentDef) obj).isIsBoundary()) {
					boundaryComp.add(obj.getName());
				}
			}
		}
		
	}

	private void traduzirConfigComponents(Package pkg) {		
		for(ElementDef obj: pkg.getDefinitions()) {
			if(obj instanceof ComponentDef) {
				String configComp = "";
				if(!((ComponentDef) obj).isIsBoundary() && ((ComponentDef) obj).getComposite() != null) {
					for(ComponentUse comp : ((ComponentDef) obj).getComposite().getComponents()) {
						if(((ComponentDef) obj).getComposite().getComponents().get(((ComponentDef) obj).getComposite().getComponents().size()-1).equals(comp)) {
							configComp += comp.getName()+"_" +comp.getDefinition().getName();
						}
						else
							configComp += comp.getName()+"_" +comp.getDefinition().getName()+ "|||";
					}
					resultText += obj.getName() + " =" + configComp+"\n";
				}				
			}
		}	
	}
	
	private void traduzirConnectors(Package pkg) {
		Map<String, List<String>> connectors = new HashMap<String, List<String>>();
		List<String> aux = new ArrayList<String>();
		for(ElementDef obj: pkg.getDefinitions()) {
			if(obj instanceof ComponentDef) {				
				if(!((ComponentDef) obj).isIsBoundary() && ((ComponentDef) obj).getComposite() != null) {
					for(ConnectorUse conn : ((ComponentDef) obj).getComposite().getConnectors()) {
						System.out.println(conn.toString());					
						for(ConnectorBinding bind : conn.getBindings()) {
							if(connectors.keySet().contains(conn.getName()+"_"+conn.getDefinition().getName())) {
								List<String> aux2 = connectors.get(conn.getName()+"_"+conn.getDefinition().getName());
								aux2.add(bind.getSource().getName()+","+bind.getDestination().getName());
								connectors.put(conn.getName()+"_"+conn.getDefinition().getName() , aux2);
							}
							else {
								List<String> aux2 = new ArrayList<String>();
								aux2.add(bind.getSource().getName()+","+bind.getDestination().getName());
								connectors.put(conn.getName()+"_"+conn.getDefinition().getName(),aux2);
							}
						}
						
					}				
				}
			}
		}
		for(Map.Entry<String, List<String>> mp : connectors.entrySet()) {
			resultText += mp.getKey() + "= ";
			if(mp.getValue().size() > 1) {
				for(String cn : mp.getValue()) {
					String[] srcDest = cn.split(",");
					resultText += getChannelToConnector(true, srcDest[0])  + "?"+ getDefinitionNameForConnector(getChannelToConnector(true, srcDest[0])) +" ->" + 
							getChannelToConnector(false, srcDest[1]) + "!"+ getDefinitionNameForConnector(getChannelToConnector(false, srcDest[1])) + "->";
				}
				resultText += mp.getKey() + "\n";
			}
			else {
				String[] srcDest = mp.getValue().get(0).split(",");
				resultText += getChannelToConnector(true, srcDest[0])  + "?"+ getDefinitionNameForConnector(getChannelToConnector(true, srcDest[0])) +" ->" + 
					getChannelToConnector(false, srcDest[1])+"!"+ getDefinitionNameForConnector(getChannelToConnector(false, srcDest[1])) + "->" + mp.getKey() + "\n";
			}			
		}	
	}
	
	private String getDefinitionNameForConnector(String conn) {
		String[] aux = conn.split("_");
		SimplePortDef def = portsMap.get(aux[aux.length-1]);
		return def.getFlowType().getName().toLowerCase();
	}
	
	private String getChannelToConnector(boolean isOut, String namePort) {
		if(portsChannelSimple.get(namePort) != null) {
			return portsChannelSimple.get(namePort);
		}
		else if(isOut) {
			for(String ch : portsChannelComposite.get(namePort)) {
				String[] aux = ch.split("_");
				if(portsMap.get(aux[aux.length-1]).getFlowProperties().getLiteral().equals("out")) {
					return ch;
				}
			}
		}
		else {
			for(String ch : portsChannelComposite.get(namePort)) {
				String[] aux = ch.split("_");
				if(portsMap.get(aux[aux.length-1]).getFlowProperties().getLiteral().equals("in")) {
					return ch;
				}
			}
		}
		return "???";
	}
		
	private void traduzirPortDef(Package pkg) {
		for(ElementDef obj :  pkg.getDefinitions()) {
			if(obj instanceof SimplePortDef) {				
				portsMap.put(((SimplePortDef)obj).getName(), ((SimplePortDef)obj));
			}
			else if(obj instanceof CompositePortDef) {
				List<String> aux = new ArrayList<String>();
				for(PortUse port: ((CompositePortDef)obj).getPorts()) {
					aux.add(port.getDefinition().getName());
				}
				compositePorts.put(obj.getName(), aux);
			}
		}
		
	}

	private void traduzirTypes(Package pkg) {
		for(ElementDef obj : pkg.getDefinitions()) {
			System.out.println(obj.getName());
			List<EObject> list = obj.eContents();
			String literal = "";
			String map1 = "";
			String map2 = "";			
			for(EObject content :  list) {				
				System.out.println(content.toString());
				if(content instanceof EnumLiteralValue) {
					if(list.get(0).equals(content))
						resultText += "datatype " + obj.getName() + "= ";
					if(list.get(list.size()-1).equals(content))
						literal += ((EnumLiteralValue) content).getName() + "\n";
					else
						literal += ((EnumLiteralValue) content).getName() + "|";
				}
				if(content instanceof TypeUse) {
					String type = "";
					if(((TypeUse) content).getDefinition().getName().equals("String")) {
						type = "Char";
					}					
					if(list.get(0).equals(content))
						resultText += obj.getName() + "=";
					if(list.get(list.size()-1).equals(content)) {
						map1 += ((TypeUse) content).getName();						
						if(type != "")
							map2 += ((TypeUse) content).getName() +"<-"+type;
						else
							map2 += ((TypeUse) content).getName() +"<-"+((TypeUse) content).getDefinition().getName();
					}
					else {
						map1 += ((TypeUse) content).getName()+".";
						if(type != "")
							map2 += ((TypeUse) content).getName() +"<-"+type+",";
						else
						map2 += ((TypeUse) content).getName() +"<-"+((TypeUse) content).getDefinition().getName()+",";
					}									
				}
			}
			String cardMap = "";
			String getAndSet = "";
			if(!map1.equals(""))
				cardMap = "{ " + map1 + " | " + map2 +"}\n";
			//fazer o get e set do cardMap TODO
			if(!map2.equals("")) {
				String[] aux = map2.split(",");
				for(String p : aux) {
					String[] aux2 = p.split("<-");
					getAndSet += "get" + aux2[0] +"_"+ obj.getName() +"(" + map1 +")"+ " = " + aux2[0] + "\n" ;
				}
			}
			resultText += literal + cardMap;
			resultText += getAndSet;
		}
	}	
	
	private void traduzirChannel(Package pkg) {
		for(ElementDef comp : pkg.getDefinitions()) {		
			if(comp instanceof ComponentDef) {				
				if(!((ComponentDef) comp).isIsBoundary() && ((ComponentDef) comp).getComposite() != null) {
					for(ComponentUse c : ((ComponentDef) comp).getComposite().getComponents()) {
						System.out.println(c.getName());
						for(PortUse port : c.getPorts()) {
							if(port.getDefinition() instanceof SimplePortDef) {
								resultText += "channel " + c.getName() + "_" + port.getName()+ "_"+
								port.getDefinition().getName()+ ": " + portsMap.get(port.getDefinition().getName()).getFlowType().getName()+"\n";
								portsChannelSimple.put(c.getName()+"_"+port.getName(), c.getName() + "_" + port.getName()+ "_"+
								port.getDefinition().getName());
							}
							else if(port.getDefinition() instanceof CompositePortDef) {
								List<String> pc = new ArrayList<String>();
								for(String p : compositePorts.get(port.getDefinition().getName())) {
									resultText += "channel " + c.getName() + "_" + port.getName()+ "_"+
									port.getDefinition().getName()+ "_" + p +  ": " + portsMap.get(p).getFlowType().getName()+"\n";
									pc.add(c.getName() + "_" + port.getName()+ "_"+
									port.getDefinition().getName()+ "_" + p);
								}
								portsChannelComposite.put(port.getName(), pc);
							}
							
						}
					}
				}										
			}
		}
	}	
	
	private void makeCspArq() {
		try {
			File arq = new File("sysadl2csp.csp");
			arqResult = new FileWriter(arq);			
		     arqResult.append(resultText);
		     arqResult.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
	}

}
