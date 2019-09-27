package org.csp.translater.query;

import java.util.ArrayList;
import java.util.List;

import org.sysadl.ActionUse;
import org.sysadl.ActivityDef;
import org.sysadl.ActivityRelation;
import org.sysadl.ComponentDef;
import org.sysadl.ComponentUse;
import org.sysadl.CompositePortDef;
import org.sysadl.DataStore;
import org.sysadl.Delegation;
import org.sysadl.ElementDef;
import org.sysadl.Model;
import org.sysadl.Pin;
import org.sysadl.PortUse;
import org.sysadl.SimplePortDef;
import org.sysadl.impl.PinImpl;

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
		String aux = "";
		for (Pin pin : paramAction) {
			for (ActivityRelation activityRelation : flow) {
				if(activityRelation.getTarget() instanceof  DataStore) {
					sourceDataStore += ((PinImpl)activityRelation.getSource()).getName()+",";
				}
				if(activityRelation.getSource() instanceof ActionUse){ 					
					aux += ((PinImpl)activityRelation.getTarget()).getName();
					System.out.println(aux);
				}
				if (activityRelation.getTarget() instanceof PinImpl) {
					System.out.println(paramAction);
					System.out.println(((PinImpl)activityRelation.getTarget()).getName());
					if (activityRelation.getSource() instanceof PinImpl) {
						System.out.println(((PinImpl)activityRelation.getSource()).getName());
					}					
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
}
