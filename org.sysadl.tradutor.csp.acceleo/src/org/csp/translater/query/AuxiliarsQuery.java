package org.csp.translater.query;

import java.util.ArrayList;
import java.util.List;

import org.sysadl.ComponentDef;
import org.sysadl.ComponentUse;
import org.sysadl.CompositePortDef;
import org.sysadl.Delegation;
import org.sysadl.ElementDef;
import org.sysadl.Model;
import org.sysadl.PortUse;
import org.sysadl.SimplePortDef;

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
						System.out.println(compDef);						
						for (Delegation delegation : ((ComponentDef)elemDef).getComposite().getDelegations()) {
							delegations += "Delegation_" + delegation.getSource().getName() + "_To_" + delegation.getDestination().getName() + "= ";
							del.add("Delegation_" + delegation.getSource().getName() + "_To_" + delegation.getDestination().getName());
							if (delegation.getSource().getDefinition() instanceof SimplePortDef) {
								if (((SimplePortDef)delegation.getSource().getDefinition()).getFlowProperties().getLiteral().equalsIgnoreCase("in")) {
									for (ComponentUse compUse : compDef.get(compDef.size()-2).getComposite().getComponents()) {
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
									for (ComponentUse compUse : compDef.get(compDef.size()-1).getComposite().getComponents()) {
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
												System.out.println("TESTE------1");
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

}
