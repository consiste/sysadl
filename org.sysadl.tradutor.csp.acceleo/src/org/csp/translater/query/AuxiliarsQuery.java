package org.csp.translater.query;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.sysadl.ActionDef;
import org.sysadl.ActionUse;
import org.sysadl.ActivityAllocation;
import org.sysadl.ActivityDef;
import org.sysadl.ActivityFlow;
import org.sysadl.ActivityRelation;
import org.sysadl.Allocation;
import org.sysadl.AllocationTable;
import org.sysadl.ComponentDef;
import org.sysadl.ComponentUse;
import org.sysadl.CompositePortDef;
import org.sysadl.Configuration;
import org.sysadl.ConnectorUse;
import org.sysadl.ConstraintDef;
import org.sysadl.ConstraintUse;
import org.sysadl.DataStore;
import org.sysadl.DataTypeDef;
import org.sysadl.Delegation;
import org.sysadl.ElementDef;
import org.sysadl.Executable;
import org.sysadl.Model;
import org.sysadl.Pin;
import org.sysadl.PortUse;
import org.sysadl.SimplePortDef;
import org.sysadl.Statement;
import org.sysadl.StructuralDef;
import org.sysadl.grammar.util.SysADLGrammarUtil;
import org.sysadl.impl.ActionDefImpl;
import org.sysadl.impl.ActionUseImpl;
import org.sysadl.impl.ActivityDelegationImpl;
import org.sysadl.impl.PinImpl;
import org.sysadl.impl.SimplePortDefImpl;

public class AuxiliarsQuery {
	
	public String getDelegations(Model model) {
		String delegations = "";
		List<ComponentDef> compDef = new ArrayList<ComponentDef>();
		List<String> del = new ArrayList<String>();
		for (org.sysadl.Package pck : model.getPackages()) {
			for (ElementDef elemDef : pck.getDefinitions()) {
				if (elemDef instanceof ComponentDef) {
					if (((ComponentDef)elemDef).getComposite() != null) {
						compDef.add(((ComponentDef)elemDef));											
						for (Delegation delegation : ((ComponentDef)elemDef).getComposite().getDelegations()) {
							delegations += delegation.getSource().getName() + "_To_" + delegation.getDestination().getName() + "= ";
							del.add( delegation.getSource().getName() + "_To_" + delegation.getDestination().getName());
							if (delegation.getSource().getDefinition() instanceof SimplePortDef) {
								if (((SimplePortDef)delegation.getSource().getDefinition()).getFlowProperties().getLiteral().equalsIgnoreCase("in")) {
									for (ComponentUse compUse : compDef.get(compDef.size()-2).getComposite().getComponents()) {
										for (PortUse portUse : compUse.getPorts()) {
											if (portUse.getDefinition() instanceof SimplePortDef) {
												if (portUse.getName().equals(delegation.getDestination().getName())) {
													delegations += compUse.getName()+"_"+portUse.getName()+"_"+portUse.getDefinition().getName() + 
															"?"+((SimplePortDef)portUse.getDefinition()).getFlowType().getName().toLowerCase() + " ->\n";
												}
											}else {
												for (PortUse portUseAux : ((CompositePortDef)portUse.getDefinition()).getPorts()) {
													if (portUseAux.getName().equals(delegation.getDestination().getName())) {
														delegations += compUse.getName()+"_"+portUse.getName()+"_"+portUseAux.getName()+"_"+
																	portUse.getDefinition().getName() + 
																"?"+((SimplePortDef)portUseAux.getDefinition()).getFlowType().getName().toLowerCase() + " ->\n";
													}
												}
											}																						
										}									
									}									
									for (ComponentUse compUse : compDef.get(compDef.size()-1).getComposite().getComponents()) {
										for (PortUse portUse : compUse.getPorts()) {
											if (portUse.getDefinition() instanceof SimplePortDef) {
												if (portUse.getName().equals(delegation.getSource().getName())) {
													delegations += compUse.getName()+"_"+portUse.getName()+"_"+portUse.getDefinition().getName() + 
															"!"+((SimplePortDef)portUse.getDefinition()).getFlowType().getName().toLowerCase() + " ->\n";
												}
											}else {
												for (PortUse portUseAux : ((CompositePortDef)portUse.getDefinition()).getPorts()) {
													if (portUseAux.getName().equals(delegation.getSource().getName())) {
														delegations += compUse.getName()+"_"+portUse.getName()+"_"+portUseAux.getName()+"_"+
																	portUse.getDefinition().getName() + 
																"!"+((SimplePortDef)portUse.getDefinition()).getFlowType().getName().toLowerCase() + " ->\n";
													}
												}
											}
										}									
									}								
								}else {
									for (ComponentUse compUse : compDef.get(compDef.size()-1).getComposite().getComponents()) {
										for (PortUse portUse : compUse.getPorts()) {
											if (portUse.getDefinition() instanceof SimplePortDef) {
												if (portUse.getName().equals(delegation.getSource().getName())) {
													delegations += compUse.getName()+"_"+portUse.getName()+"_"+portUse.getDefinition().getName() + 
															"?"+((SimplePortDef)portUse.getDefinition()).getFlowType().getName().toLowerCase() + " ->\n";
												}
											}else {
												for (PortUse portUseAux : ((CompositePortDef)portUse.getDefinition()).getPorts()) {
													if (portUseAux.getName().equals(delegation.getSource().getName())) {
														delegations += compUse.getName()+"_"+portUse.getName()+"_"+portUseAux.getName()+"_"+
																	portUse.getDefinition().getName() + 
																"?"+((SimplePortDef)portUse.getDefinition()).getFlowType().getName().toLowerCase() + " ->\n";
													}
												}
											}
																						
										}									
									}
									for (ComponentUse compUse : compDef.get(compDef.size()-2).getComposite().getComponents()) {
										for (PortUse portUse : compUse.getPorts()) {											
											if (portUse.getDefinition() instanceof SimplePortDef) {
												if (portUse.getName().equals(delegation.getDestination().getName())) {
													delegations += compUse.getName()+"_"+portUse.getName()+"_"+portUse.getDefinition().getName() + 
															"!"+((SimplePortDef)portUse.getDefinition()).getFlowType().getName().toLowerCase() + " ->\n";
												}
											}else {
												for (PortUse portUseAux : ((CompositePortDef)portUse.getDefinition()).getPorts()) {
													if (portUseAux.getName().equals(delegation.getDestination().getName())) {
														delegations += compUse.getName()+"_"+portUse.getName()+"_"+portUseAux.getName()+"_"+
																	portUse.getDefinition().getName() + 
																"!"+((SimplePortDef)portUseAux.getDefinition()).getFlowType().getName().toLowerCase() + " ->\n";
													}
												}
											}											
										}									
									}
								}
							}
							else {
								for (ComponentUse compUse : compDef.get(compDef.size()-2).getComposite().getComponents()) {
									for (PortUse portUse : compUse.getPorts()) {
										if (portUse.getDefinition() instanceof CompositePortDef) {
											if (portUse.getName().equals(delegation.getSource().getName())) {
												for (PortUse portUseAux : ((CompositePortDef)portUse.getDefinition()).getPorts()) {
													delegations += compUse.getName() + "_" + portUse.getName() +"_" + portUseAux.getName() + 
																"_" + portUse.getDefinition().getName() + "?" 
																+ ((SimplePortDef)portUseAux.getDefinition()).getFlowType().getName().toLowerCase()+ "->\n"; 
												}
											}
										}
									}
								}
								for (ComponentUse compUse : compDef.get(compDef.size()-1).getComposite().getComponents()) {
									for (PortUse portUse : compUse.getPorts()) {
										if (portUse.getDefinition() instanceof CompositePortDef) {
											if (portUse.getName().equals(delegation.getDestination().getName())) {												
												for (PortUse portUseAux : ((CompositePortDef)portUse.getDefinition()).getPorts()) {
													delegations += compUse.getName() + "_" + portUse.getName() +"_" + portUseAux.getName() + 
																"_" + portUse.getDefinition().getName() + "!" 
																+ ((SimplePortDef)portUseAux.getDefinition()).getFlowType().getName().toLowerCase()+ "->\n"; 
												}
											}
										}
									}
								}
							}
							delegations += delegation.getSource().getName() + "_To_" + delegation.getDestination().getName() + "\n\n";
						}
					}
				}				
			}
		}
		
		return delegations;
	}

	
	private String getParamAction(List<Pin> paramAction, List<ActivityRelation> flow) {
		String param = "";
		String sourceDataStore = "";		
		for (Pin pin : paramAction) {
			for (ActivityRelation activityRelation : flow) {
				if(activityRelation.getTarget() instanceof  DataStore) {
					sourceDataStore += ((PinImpl)activityRelation.getSource()).getName()+",";
				}				
				if (activityRelation.getTarget() instanceof PinImpl) {														
					if (pin.getName().equals(((PinImpl)activityRelation.getTarget()).getName())) {
						if (activityRelation.getSource() instanceof PinImpl) {							
							if (pin.equals(paramAction.get(paramAction.size()-1))) {
								param += ((PinImpl)activityRelation.getSource()).getName();
								break;
							}else {
								param += ((PinImpl)activityRelation.getSource()).getName() + ",";
								break;
							}							
						}
						if (activityRelation.getSource() instanceof  DataStore && !param.contains(sourceDataStore)) {
							param += sourceDataStore;
							sourceDataStore = "";
						}
						if (activityRelation.getSource() instanceof ActionUse) {
							param += pin.getName();							
						}					
					}					
				}
				
			}
		}
		return param;
	}
	
	
	public String getParamActionOut(ActionUse action, List<ActivityRelation> flow) {
		String paramOut = "";
		for (ActivityRelation activityRelation : flow) {
			if (activityRelation instanceof ActivityDelegationImpl) {
				if ((((ActivityDelegationImpl)activityRelation).getSource()) instanceof PinImpl) {
					if ((((ActivityDelegationImpl)activityRelation).getTarget()) instanceof ActionUseImpl) {						
						if (action.getName().equals(((ActionUseImpl)((ActivityDelegationImpl)activityRelation).getTarget()).getName())) {
							paramOut += ((PinImpl)((ActivityDelegationImpl)activityRelation).getSource()).getName();
						}
					}					
				}				
			}
			else if (activityRelation instanceof ActivityFlow) {
				//TODO
			}
		}
		return paramOut;
	}
	
	private String getDefParamOutAction(ActionUse action, List<ActivityRelation> flow) {
		String def = "";
		for (ActivityRelation activityRelation : flow) {
			if (activityRelation instanceof ActivityDelegationImpl) {
				if ((((ActivityDelegationImpl)activityRelation).getSource()) instanceof PinImpl) {
					if ((((ActivityDelegationImpl)activityRelation).getTarget()) instanceof ActionUseImpl) {						
						if (action.getName().equals(((ActionUseImpl)((ActivityDelegationImpl)activityRelation).getTarget()).getName())) {
							def += ((PinImpl)((ActivityDelegationImpl)activityRelation).getSource()).getDefinition().getName();
							break;
						}
					}
				}
				
			}
			else {				
				def += ((Pin)((ActivityFlow)activityRelation).getTarget()).getDefinition().getName(); 
				break;				
			}
		}
		return def;
	}
		
		
	public String getActivityToStructure(StructuralDef structural, AllocationTable allocTable) {
		String result = "";
		for (Allocation alloc : allocTable.getAllocs()) {
			if (alloc instanceof ActivityAllocation) {
				if (((ActivityAllocation)alloc).getTarget().getName().equals(structural.getName())) {
					result = ((ActivityAllocation)alloc).getSource().getName();
				}
			}
		}
		return result;
	}
	
	public boolean existAlloc(StructuralDef structural, AllocationTable allocTable) {
		for (Allocation alloc : allocTable.getAllocs()) {
			if (alloc instanceof ActivityAllocation) {
				if (((ActivityAllocation)alloc).getTarget().getName().equals(structural.getName())) {
					return true;
				}
			}
		}
		return false;
	}
	
	public ActivityDef getActivityFromAllocTable(StructuralDef structural, AllocationTable allocTable) {
		for (Allocation alloc : allocTable.getAllocs()) {
			if (alloc instanceof ActivityAllocation) {
				if (((ActivityAllocation)alloc).getTarget().getName().equals(structural.getName())) {
					return ((ActivityAllocation)alloc).getSource();
				}
			}
		}
		return null;
	}	
	
	public String getContraints(ConstraintDef constraint) {
		String result = "";
		String expres = SysADLGrammarUtil.getInstance().nodeText(constraint.getEquation());	
		if (expres != "") {			
			String[] aux = expres.split(" ");
			String operation = "";
			if (!(expres.contains("->") || expres.contains("?")|| expres.contains("&&") || expres.contains(":"))) {
				String[] aux2 = expres.split("==");
				operation += aux2[1];
			}
			for (int i = 0; i < aux.length; i++) {
				for (int j = 0; j < constraint.getOutParameters().size(); j++) {
					if (constraint.getOutParameters().get(j).getName().equals(aux[i])) {
						aux[i] = "";
						result += "x";
					}
				}
				if (aux[i].equals("==")) {
					result += aux[i];
				}
				else if (aux[i].equals("&&")) {
					result += " and ";
				}
				else if (aux[i].equals("?")) {
					String condition = "";
					for (int j = 0; j < i; j++) {					
						condition += aux[j];
					}
					result += "if ("+condition+ ") then ";
				}
				else if (aux[i].equals(":")) {
					result += " else ";				
				}
				else if (aux[i].contains("->") && aux[i].contains(".")) {
					String[] type = aux[i].split("->");
					result += type[1];
				}
				else if (aux[i].contains("->") && !aux[i].contains(".")) {
					String[] aux2 = aux[i].split("->");
					for (int j = 0; j < constraint.getInParameters().size(); j++) {
						if (constraint.getInParameters().get(j).getName().equals(aux2[0])) {
							aux2[1] = constraint.getInParameters().get(j).getDefinition().getName()+"_"+aux2[1]+"("+aux2[0]+")";
						}
					}
					for (int j = 0; j < constraint.getOutParameters().size(); j++) {
						if (constraint.getOutParameters().get(j).getName().equals(aux2[0])) {
							aux2[1] = constraint.getOutParameters().get(j).getDefinition().getName()+"_"+aux2[1]+"(x)";
						}
					}
					result += aux2[1];
				}
				else {
					
				}				
			}
			result += operation;			
		}
		
		return result;
	}
	
	public String getExecution(Executable executable) {
		String result = "";
		String expres = "";
		for (int i = 0; i < executable.getBody().size(); i++) {			
			expres = SysADLGrammarUtil.getInstance().nodeText(((Statement)executable.getBody().get(i)));
			expres = expres.replaceAll(";", "");
			String[] aux = expres.split(" ");
			for (int j = 0; j < aux.length; j++) {
				if (aux[j].equals("return")) {
					aux[j] = "";
				}
				if (aux[j].contains("::")) {
					aux[j] = aux[j].substring(aux[j].lastIndexOf("::")+2);
				}
				if (aux[j].contains("->")) {					
					String[] aux2 = aux[j].split("->");
					for (int k = 0; k < executable.getParams().size(); k++) {
						if (aux2[0].equals(executable.getParams().get(k).getName())) {
							aux2[1] = "get"+aux2[1]+executable.getParams().get(k).getDefinition().getName()+"("+aux2[0]+")";
						}
					}
					aux[j] = "";
					result += aux2[1];
				}
				if (aux[j].contains("if")) {
					for (int k = j+1; k < aux.length; k++) {
						if (aux[k].contains(")")) {
							aux[k] += " then ";
						}
					}
				}
				if (aux[j].equals("else")) {
					aux[j-1] +=" ";
					aux[j] = " else ";
				}
				if (aux[j].contains("&&")) {
					aux[j] = aux[j].replaceAll("&&", " and ");
				}
				if (aux[j].contains("let")) {					
					String out = "";
					String[] teste;
//					((DataTypeDef)executable.getReturnType()).getAttributes();
//					for (int k = 0; k < ((DataTypeDef)executable.getReturnType()).getAttributes().size(); k++) {
//						for (int h = i; h < executable.getBody().size(); h++) {
//							teste = SysADLGrammarUtil.getInstance().nodeText(executable.getBody().get(h)).split(" ");
//							for (int l = 0; l < teste.length; l++) {
//								if (teste[l].contains("->")) {
//									String[] param = teste[l].split("->");
//									if (((DataTypeDef)executable.getReturnType()).getAttributes().get(k).getName().equals(param[1])) {
//										if (k == ((DataTypeDef)executable.getReturnType()).getAttributes().size()-1) {
//											out += teste[l+2];											
//										}
//										else {
//											out += teste[l+2]+".";										
//										}
//										
//									}
//								}
//							}
//						}
//					}
					return out;					
				}
				result += aux[j];
			}			
			
		}
		return result;
	}
	
	public boolean isEmpty_Delegations(Configuration delegations) {
		if (delegations.getDelegations().isEmpty()) {
			return true;
		}
		return false;
	}
	
	public String getActionBody(ActivityDef activity, ActionUse action, String compUse) {
		String result = "";
		result += getParamIn(action, compUse);
		result += getParamOut(activity, action);
		result += ": {x | x <- " + getDefParamOutAction(action, activity.getBody().getFlows()) + ",";
		result += getConstraintFromAction(action);
		result +=  " } @ \n\t\t";
		result += getActionExit(action, activity.getBody().getFlows(), compUse);
		return result;
	}

	

	private String getActionExit(ActionUse action, EList<ActivityRelation> flows, String name) {
		String out = "";
		for (ActivityRelation activityRelation :flows) {			
			if (activityRelation.getSource() instanceof ActionUse) {
				if (activityRelation.getTarget() instanceof Pin) {
					if (action.getName().equals(((ActionUse)activityRelation.getSource()).getName())) {
						out += name + "_" + ((Pin)activityRelation.getTarget()).getName() + "_" + ((Pin)activityRelation.getTarget()).getDefinition().getName() +"!out ->\n\t\t";
						
					}
				
				}
			}
			if (activityRelation.getSource() instanceof Pin) {
				if (activityRelation.getTarget() instanceof ActionUse) {
					if (action.getName().equals(((ActionUse)activityRelation.getTarget()).getName())) {
						out += name + "_" + ((Pin)activityRelation.getSource()).getName() + "_" + 
								((Pin)activityRelation.getSource()).getDefinition().getName() +"!"+ 
								((Pin)activityRelation.getSource()).getName() +" ->";
						
					}
				
				}
			}
		}
		return out;
	}
	
	private String getActionFromPin(Pin pin,EList<ActivityRelation> flows ) {
		for (ActivityRelation activityRelation : flows) {
			if (activityRelation.getSource() instanceof Pin) {
				if (activityRelation.getTarget() instanceof ActionUse) {
					if (((ActionUse)activityRelation.getTarget()).getPinIn().contains(pin)) {
						return ((ActionUse)activityRelation.getTarget()).getDefinition().getName();
					}
				}				
			}
		}
		
		return null;
	}

	private String getParamIn(ActionUse action) {
		String params = "x, ";
		for (Pin pin : action.getPinIn()) {
			if (pin.equals(action.getPinIn().get(action.getPinIn().size()-1))) {
				params += pin.getName(); 
			}
			else
				params += pin.getName()+",";
		}
		
		return params;
	}

	private String getConstraintFromAction(ActionUse action) {
		String constraints ="";
		for (ConstraintUse constraint : action.getDefinition().getConstraints()) {
			constraints += constraint.getDefinition().getName() + "(" + getParamIn(action) + ")";
		}
		return constraints;
	}

	private String getParamOut(ActivityDef activity, ActionUse action) {
		String paramOut = "";
		for (ActivityRelation activityRelation : activity.getBody().getFlows()) {
			if (activityRelation instanceof ActivityDelegationImpl) {
				if ((((ActivityDelegationImpl)activityRelation).getSource()) instanceof PinImpl) {
					if ((((ActivityDelegationImpl)activityRelation).getTarget()) instanceof ActionUseImpl) {						
						if (action.getName().equals(((ActionUseImpl)((ActivityDelegationImpl)activityRelation).getTarget()).getName())) {
							paramOut += ((PinImpl)((ActivityDelegationImpl)activityRelation).getSource()).getName();
						}
					}					
				}				
			}
			else if (activityRelation instanceof ActivityFlow) {
				// he will be a channel to others actions
				if (((ActivityFlow)activityRelation).getSource() instanceof ActionUse) {
					if (((ActivityFlow)activityRelation).getTarget() instanceof Pin) {
						if (action.getName().equals(((ActionUse)((ActivityFlow)activityRelation).getSource()).getName())) {
							//paramOut += ((Pin)((ActivityFlow)activityRelation).getTarget()).getName();
							paramOut = "out";
						}
					
					}
				}
			}
		}
		return "|~|"+paramOut;
	}

	private String getParamIn(ActionUse action, String compUse) {
		String params = "";
		for (Pin pin : action.getPinIn()) {
			params += compUse+"_"+pin.getName()+"_"+pin.getDefinition().getName()+ "?" + pin.getName() + "-> \n\t";
		}
		return params;
	}
	
	public int getActionListSize(ActivityDef activity) {
		return activity.getBody().getActions().size();
	}
	
	public String getActionFunction(ActivityDef activity, String compUse) {
		String result = "";
		int cont =1;
		for (ActionUse action : activity.getBody().getActions()) {
			result += compUse+"_"+activity.getName()+"_ACTIONS("+ Integer.toString(cont)+ ")= ";
			result += compUse+ "_" + action.getName()+ "_" + action.getDefinition().getName()+ "\n";
			cont++;
		}
		
		return result;
	}
	
	public int getPinListSize(ActivityDef activity) {
		int cont = 0;
		for (ActivityRelation flow : activity.getBody().getFlows()) {
			if (! (flow instanceof ActivityFlow)) {
				cont++;
			}
		}
		return cont;
	}
	
	public String getPinFunction(ActivityDef activity, String compUse) {
		String result = "";
		int cont = 1;
		for (ActivityRelation flow : activity.getBody().getFlows()) {
			if (!(flow instanceof ActivityFlow)) {
				result += compUse+"_"+activity.getName()+"_PIN("+ Integer.toString(cont)+ ") = ";
				result +=  compUse+"_"+((Pin)flow.getSource()).getName()+ "_" + activity.getName()+ "\n";
				cont++;
			}
		}
		return result;
	}
	
	public String getPortAndPin(ComponentUse compUse, Pin pin) {
		String result = "";
		for (PortUse portUse : compUse.getPorts()) {
			if (portUse.getName().equals(pin.getName()) && ((SimplePortDef)portUse.getDefinition()).getFlowProperties().getLiteral().equalsIgnoreCase("in")) {
				result += compUse.getName()+"_"+ portUse.getName() + "_"+ portUse.getDefinition().getName()+ "?" + portUse.getName() + "-> \n";
			}
			if (portUse.getName().equals(pin.getName()) && ((SimplePortDef)portUse.getDefinition()).getFlowProperties().getLiteral().equalsIgnoreCase("out")) {
				result += compUse.getName()+"_"+ portUse.getName() + "_"+ portUse.getDefinition().getName()+ "!" + portUse.getName() + "-> \n";
			}
		}
		
		return result;
	}
	
	public String getPortAndPinConn(ConnectorUse conn, Pin pin) {
		String result = "";
		for (PortUse portUse : conn.getPorts()) {
			if (portUse.getName().equals(pin.getName()) && ((SimplePortDef)portUse.getDefinition()).getFlowProperties().getLiteral().equalsIgnoreCase("in")) {
				result += conn.getName()+"_"+ portUse.getName() + "_"+ portUse.getDefinition().getName()+ "?" + portUse.getName() + "-> \n";
			}
			if (portUse.getName().equals(pin.getName()) && ((SimplePortDef)portUse.getDefinition()).getFlowProperties().getLiteral().equalsIgnoreCase("out")) {
				result += conn.getName()+"_"+ portUse.getName() + "_"+ portUse.getDefinition().getName()+ "!" + portUse.getName() + "-> \n";
			}
		}
		
		return result;
	}
	
	public String getTypePort(PortUse port) {
		
		switch (((SimplePortDef)port.getDefinition()).getFlowType().getName()) {
		case "Int":			
			return "Nat";
		case "Boolean":
			return "Bool";
		case "String":
			return "Char";
		case "Real":
			return "Nat.Nat";
		default:
			return ((SimplePortDef)port.getDefinition()).getFlowType().getName();
		}
	}
	
	public String getTypePin(Pin pin) {
		switch (pin.getDefinition().getName()) {
		case "Int":			
			return "Nat";
		case "Boolean":
			return "Bool";
		case "String":
			return "Char";
		case "Real":
			return "Nat.Nat";
		default:
			return pin.getDefinition().getName();
		}
	}
	
	private int getQntCompNotBoundary(ComponentDef compDef) {
		int cont = 0;
		for (ComponentUse compUse : compDef.getComposite().getComponents()) {
			if (! compUse.getDefinition().isIsBoundary()) {
				cont++;
			}
		}
		return cont;
	}
	
	public String getInternalChannelsCompDef( ComponentDef compDef) {
		String result = "";
		int cont =0;
		for (ComponentUse compUse : compDef.getComposite().getComponents()) {
			if (!(compUse.getDefinition().isIsBoundary())) {
				for (PortUse portUse : compUse.getPorts()) {
					if (portUse.equals(compUse.getPorts().get(compUse.getPorts().size()-1))) {
						result += compUse.getName()+"_"+portUse.getName()+"_"+portUse.getDefinition().getName();
					}
					else
						result += compUse.getName()+"_"+portUse.getName()+"_"+portUse.getDefinition().getName()+",\n\t\t\t\t\t\t";
				}
				if (cont < getQntCompNotBoundary(compDef)-1) {
					result += ",\n\t\t\t\t\t\t";
				}
				cont++;
			}			
			
		}
		return result;
	}
	
}
