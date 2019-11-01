package org.csp.translater.query;

import java.util.ArrayList;
import java.util.List;

import org.sysadl.ActionUse;
import org.sysadl.ActivityDef;
import org.sysadl.ActivityFlow;
import org.sysadl.ActivityRelation;
import org.sysadl.ComponentDef;
import org.sysadl.ComponentUse;
import org.sysadl.CompositePortDef;
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
import org.sysadl.grammar.util.SysADLGrammarUtil;
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
							delegations += "Delegation_" + delegation.getSource().getName() + "_To_" + delegation.getDestination().getName() + "= ";
							del.add("Delegation_" + delegation.getSource().getName() + "_To_" + delegation.getDestination().getName());
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
							delegations += "Delegation_" + delegation.getSource().getName() + "_To_" + delegation.getDestination().getName() + "\n\n";
						}
					}
				}				
			}
		}
		delegations += "DELEGATIONS = ";
		for (String obj : del) {			
			if (obj.equals(del.get(del.size()-1))) {
				delegations += obj + "\n";
			}else {
				delegations += obj + " ||| \n";
			}
		}
		return delegations;
	}
	
	public String getActivity(Model model) {		
		String result = "";		
		for (org.sysadl.Package pck : model.getPackages()) {
			for (ElementDef elem : pck.getDefinitions()) {
				if (elem instanceof ActivityDef) {
					result += ((ActivityDef)elem).getName() + "(";
					for (Pin pin : ((ActivityDef)elem).getInParameters()) {
						if (pin.equals(((ActivityDef)elem).getInParameters().get(((ActivityDef)elem).getInParameters().size()-1))) {
							result += pin.getName();
						}
						else
							result += pin.getName() + ", ";
					}
					result += ") = \n";
					for (ActionUse action : ((ActivityDef)elem).getBody().getActions()) {
						if (action.equals(((ActivityDef)elem).getBody().getActions().get(((ActivityDef)elem).getBody().getActions().size()-1))) {
							result += action.getName()+"_"+ action.getDefinition().getName()+
									"(" + getParamAction(action.getPinIn() , ((ActivityDef)elem).getBody().getFlows() )+ ")\n\n";
						}
						else
							result += action.getName()+"_"+ action.getDefinition().getName() +
							"(" + getParamAction(action.getPinIn() , ((ActivityDef)elem).getBody().getFlows() )+ ") ||| ";
					}
				}
			}
		}
		return result;
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
	
	public String getAction(Model model) {
		String result = "";
		for (org.sysadl.Package pkg : model.getPackages()) {
			for (ElementDef elem : pkg.getDefinitions()) {
				if (elem instanceof ActivityDef) {
					for (ActionUse action : ((ActivityDef)elem).getBody().getActions()) {
						result += action.getDefinition().getName() + 
								"(" + getParamAction(action.getPinIn() , ((ActivityDef)elem).getBody().getFlows() )+ ") = ";
						result += "\n |~| ";
						result += getOutParamActions(action, ((ActivityDef)elem).getBody().getFlows());
						result += ": {x | x <- " + getDefParamOutAction(action, ((ActivityDef)elem).getBody().getFlows()) + ",";
						result += getConstraintsAction(action);
						result += "} @ \n";
						result += getChannelToAction(((ActivityDef)elem).getName(),getDefParamOutAction(action, ((ActivityDef)elem).getBody().getFlows()), model);
						result += getOutParamActions(action, ((ActivityDef)elem).getBody().getFlows())+"->\n";
						result += action.getDefinition().getName() + 
								"(" + getParamAction(action.getPinIn() , ((ActivityDef)elem).getBody().getFlows() )+ ")";
						result += "\n\n";
					}
				}
				
			}
		}
		return  result;
	}
	
	private String getChannelToAction(String activity, String type, Model model) {
		String result = "";
		activity = activity.substring(0, activity.length()-2);
		for (org.sysadl.Package pkg : model.getPackages()) {
			for (ElementDef elem : pkg.getDefinitions()) {
				if (elem instanceof ComponentDef && ((ComponentDef)elem).getComposite() != null) {					
					for (ComponentUse comp : ((ComponentDef)elem).getComposite().getComponents()) {
						if (activity.equals(comp.getDefinition().getName())) {
							for (PortUse port : comp.getPorts()) {
								if (port.getDefinition() instanceof SimplePortDef) {
									if (((SimplePortDefImpl) port.getDefinition()).getFlowProperties().getLiteral().equals("out")) {
										if (((SimplePortDefImpl) port.getDefinition()).getFlowType().getName().equals(type)) {
											result += comp.getName() +"_"+port.getName() + "_" +((SimplePortDefImpl) port.getDefinition()).getName()+"!";
											break;
										}
									}
								}
//								else {
//									for (PortUse compPort : ((CompositePortDef)port.getDefinition()).getPorts()) {
//										if (((SimplePortDefImpl) compPort.getDefinition()).getFlowProperties().getLiteral().equals("out")) {
//											if (((SimplePortDefImpl) compPort.getDefinition()).getFlowType().getName().equals(type)) {
//												result += comp.getName() +"_"+port.getName()+"_"+compPort.getName() + "_" +((SimplePortDefImpl) port.getDefinition()).getName()+"!";
//											}
//										}
//									}
//								}
							}
						}
					}
				}
			}
		}
		
		
		return result;
	}
	
	private String getOutParamActions(ActionUse action, List<ActivityRelation> flow) {
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
						}
					}
				}
				
			}
		}
		return def;
	}
	
	private String getConstraintsAction(ActionUse action) {
		String constraints = "";
		for (ConstraintUse restricoes : action.getDefinition().getConstraints()) {
			if (restricoes.equals(action.getDefinition().getConstraints().get(action.getDefinition().getConstraints().size()-1))) {
				constraints += restricoes.getDefinition().getName();
				constraints += "(x" + getParametersConstraints(restricoes.getDefinition().getInParameters()) + ")";
			}
			else {
				constraints += restricoes.getDefinition().getName() ;
				constraints += "(x" + getParametersConstraints(restricoes.getDefinition().getInParameters()) + ")" + ",";
			}
				
			
		}
		return constraints;
	}
	
	private String getParametersConstraints(List<Pin> param) {
		String result = "";
		if (param.size() > 0) {
			result += ",";
		}
		for (Pin pin : param) {			
			if (pin.equals(param.get(param.size()-1))) {
				result += pin.getName();
			}
			else
				result += pin.getName() + ",";
		}
		return result;
	}
	
	public String getActivityToComponents(ComponentUse compUse, Model model) {
		String result = "";
		List<String> param = new ArrayList<String>();
		for (PortUse port : compUse.getPorts()) {
			if (port.getDefinition() instanceof SimplePortDef) {
				if (((SimplePortDefImpl) port.getDefinition()).getFlowProperties().getLiteral().equals("in")) {
					param.add(port.getName().toLowerCase());
				}
			}
			else {
				for (PortUse compPort : ((CompositePortDef)port.getDefinition()).getPorts()) {
					if (((SimplePortDefImpl) compPort.getDefinition()).getFlowProperties().getLiteral().equals("in")) {
						param.add(compPort.getName().toLowerCase());
					}
				}
			}
		}
		for (org.sysadl.Package pkg : model.getPackages()) {
			for (ElementDef elem: pkg.getDefinitions()) {
				if (elem instanceof ActivityDef) {					
					if (((ActivityDef)elem).getName().contains(compUse.getDefinition().getName())) {						
						result += ((ActivityDef)elem).getName() + "(";
						for (int i = 0; i < param.size(); i++) {
							if (param.get(i).equals(param.get(param.size()-1))) {
								result += param.get(i);
							}
							else
								result += param.get(i) + ", ";
						}
						result += ");";
					}
				}
			}
		}
		return result;
	}
	
	public String getContraints(ConstraintDef constraint) {
		String result = " ";
		String expres = SysADLGrammarUtil.getInstance().nodeText(constraint.getEquation());		
		String[] aux = expres.split(" ");
		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < constraint.getOutParameters().size(); j++) {
				if (constraint.getOutParameters().get(j).getName().equals(aux[i])) {
					aux[i] = "x";
				}
			}
			if (aux[i].equals("&&")) {
				aux[i] = " and ";
			}
			if (aux[i].contains("::")) {
				aux[i] = aux[i].substring(aux[i].lastIndexOf("::")+2);							
			}
			if (aux[i].contains("->")) {
				String[] aux2 = aux[i].split("->");
				for (int j = 0; j < constraint.getInParameters().size(); j++) {
					if (constraint.getInParameters().get(j).getName().equals(aux2[0])) {
						aux2[1] = "get"+aux2[1]+constraint.getInParameters().get(j).getDefinition().getName()+"("+aux2[0]+")";
					}
				}
				for (int j = 0; j < constraint.getOutParameters().size(); j++) {
					if (constraint.getOutParameters().get(j).getName().equals(aux2[0])) {
						aux2[1] = "get"+aux2[1]+constraint.getOutParameters().get(j).getDefinition().getName()+"(x)";
					}
				}
				aux[i] = "";
				result += aux2[1];
			}
			
			result += aux[i];
		}
		for (int i = 0; i < aux.length; i++) {
			if (aux[i].equals("?")) {
				result = "";
				result += "if( " + aux[i-3] + aux[i-2] + aux[i-1] + " ) then " + aux[i+1] + aux[i+2] + aux[i+3] + " else " 
						+ aux[i+5] + aux[i+6] + aux[i+7];
				break;
				
			}
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
					((DataTypeDef)executable.getReturnType()).getAttributes();
					for (int k = 0; k < ((DataTypeDef)executable.getReturnType()).getAttributes().size(); k++) {
						for (int h = i; h < executable.getBody().size(); h++) {
							teste = SysADLGrammarUtil.getInstance().nodeText(executable.getBody().get(h)).split(" ");
							for (int l = 0; l < teste.length; l++) {
								if (teste[l].contains("->")) {
									String[] param = teste[l].split("->");
									if (((DataTypeDef)executable.getReturnType()).getAttributes().get(k).getName().equals(param[1])) {
										if (k == ((DataTypeDef)executable.getReturnType()).getAttributes().size()-1) {
											out += teste[l+2];											
										}
										else {
											out += teste[l+2]+".";										
										}
										
									}
								}
							}
						}
					}
					return out;					
				}
				result += aux[j];
			}			
			
		}
		return result;
	}
}
