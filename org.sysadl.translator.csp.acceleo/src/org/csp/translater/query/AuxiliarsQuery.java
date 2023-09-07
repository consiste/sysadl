package org.csp.translater.query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.BiconnectivityInspector;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.nio.dot.DOTExporter;
import org.jgrapht.traverse.TopologicalOrderIterator;
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
import org.sysadl.ConnectorBinding;
import org.sysadl.ConnectorDef;
import org.sysadl.ConnectorUse;
import org.sysadl.ConstraintDef;
import org.sysadl.ConstraintUse;
import org.sysadl.DataStore;
import org.sysadl.DataTypeDef;
import org.sysadl.Delegation;
import org.sysadl.ElementDef;
import org.sysadl.Enumeration;
import org.sysadl.Executable;
import org.sysadl.Model;
import org.sysadl.Package;
import org.sysadl.Pin;
import org.sysadl.PortUse;
import org.sysadl.SimplePortDef;
import org.sysadl.Statement;
import org.sysadl.StructuralDef;
import org.sysadl.TypeDef;
import org.sysadl.UnitDef;
import org.sysadl.ValueTypeDef;
import org.sysadl.grammar.util.SysADLGrammarUtil;
import org.sysadl.impl.ActionUseImpl;
import org.sysadl.impl.ActivityDelegationImpl;
import org.sysadl.impl.EnumerationImpl;
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
	
	public String expresWithImplies(String express) {
		String result = "";
		String[] aux = express.split(" ");
		ArrayList<String> implies = new ArrayList<String>();
		int open = 0, close = 0, begin = 0;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i].contains("->") && aux[i].contains(".")) {
				String[] type = aux[i].split("->");
				aux[i] = type[1];
			}				
		}
		for (int i = 0; i < aux.length; i++) {
			if (aux[i].equals("implies")) {
				for (int j = i; j >= begin; j--) {
					if (aux[j].contains("((")) {
						open++;
						open++;
					}
					else if (aux[j].contains("(")) {
						open++;
					}
					if (aux[j].contains("))")) {
						close++;
						close++;
					}
					else if (aux[j].contains(")")) {
						close++;
					}
				}
				for (int j = i; j < aux.length; j++) {
					if (aux[j].contains("((")) {
						open++;
						open++;
					}
					else if (aux[j].contains("(")) {
						open++;
					}
					if (aux[j].contains("))")) {
						close++;
						close++;
					}
					else if (aux[j].contains(")")) {
						close++;						
					}
					if (open == close) {
						String string = "";
						for (int j2 = begin; j2 <= j; j2++) {
							string += aux[j2];							
						}
						implies.add(string);
						begin = j;
						begin++;
						break;
					}
					
				}
			}
			
		}
		if (implies.size() > 0) {
			ArrayList<String> conn = new ArrayList<String>();			
			for (int j =0; j < implies.size(); j++) {				
				if (implies.get(j).startsWith("||")) {
					conn.add(" or ");
					implies.set(j,implies.get(j).replaceFirst("||", "")) ;
				}
				else if (implies.get(j).startsWith("&&")) {
					conn.add(" and ");
					implies.set(j,implies.get(j).replaceFirst("&&", "")) ;
				}				
				String[] aux2 = implies.get(j).split("implies");
				for (int i = 0; i < aux2.length; i++) {
					aux2[i] = aux2[i].replaceAll("&&", " and ");				
				}
				
				if (!conn.isEmpty()) {
					result += conn.get(0);
					conn.remove(0);
				}
				result += "(not " + aux2[0] + ") or " + aux2[1];
				
			}
		}
		
		
		return result;
	}
	
	public String expresWithIfAndElse(String express) {
		String result ="";
		String[] aux = express.split(" ");
		int cont = 0;
		boolean open = true;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i].equals("?")) {
				cont = i;
				result += "if ";
				for (int j = 0; j < i; j++) {					
					result += aux[j]+ " ";					
				}
				result += " then ";
			}
			else if (aux[i].contains(":")) {				
				for (int j = cont+1; j < i; j++) {					
					if (aux[j].contains("->") && aux[j].contains(".")) {
						if (open) {
							result += " (";
							open = false;
						}
						String[] type = aux[j].split("->");						
						result += type[1]+ " ";
					}
					else if (aux[j].contains("&&")) 
						result += ", ";
					else
						result += aux[j]+ " ";		
				}
				if (express.contains("->")) {
					result += ")";
				}
				
				open = true;
				result += " else ";				
				for (int j = i+1; j < aux.length; j++) {
					if (aux[j].contains("->") && aux[j].contains(".")) {
						if (open) {
							result += " (";
							open = false;
						}
						String[] type = aux[j].split("->");						
						result += type[1]+ " ";
					}
					else if (aux[j].contains("&&")) 
						result += ", ";
					else
						result += aux[j]+ " ";					
				}
				if (express.contains("->")) {
					result += ")";
				}
			}										
		}
		return result;
	}
	
	public String getContraints(ConstraintDef constraint) {
		String result = "";
		String expres = SysADLGrammarUtil.getInstance().nodeText(constraint.getEquation());	
		if (expres != "") {			
			String[] aux = expres.split(" ");
			for (int i = 0; i < aux.length; i++) {
				if (aux[i].equals("==") && i > 0) {
			 		for (int j = 0; j < constraint.getOutParameters().size(); j++) {
						if (constraint.getOutParameters().get(j).getName().equals(aux[i-1])) {
							aux[i-1] = "x";
						}						
					}						
			 	}				
			}
			for (int i = 0; i < aux.length; i++) {
				result += aux[i] + " ";
				
			}
			if (!(expres.contains("implies") || expres.contains("hastype") || expres.contains("instanceof") || expres.contains("?"))) {
				result ="";
				for (int i = 0; i < aux.length; i++) {
				 	if (aux[i].equals("==") && i > 0) {
				 		for (int j = 0; j < constraint.getOutParameters().size(); j++) {
							if (constraint.getOutParameters().get(j).getName().equals(aux[i-1])) {
								aux[i-1] = "x";
							}						
						}						
				 	}
				 	else if (aux[i].equals("&&")) {
						 aux[i] = " and ";
					}
				 	else if (aux[i].equals("~")) {
						 aux[i] = " not ";
					}
				 	else if (aux[i].equals("||")) {
						 aux[i] = " or ";
					}
				 	else if (aux[i].contains("->") && aux[i].contains(".")) {
						String[] type = aux[i].split("->");
						aux[i] = type[1];
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
						aux[i] = aux2[1];
					}
				}				
				for (int i = 0; i < aux.length; i++) {
					result += aux[i] + " ";
					
				}				
			}
			else if(expres.contains("implies")) {
				result = expresWithImplies(expres);
			}
			else if(expres.contains("?")) {
				result = expresWithIfAndElse(result);
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
							aux2[1] = executable.getParams().get(k).getDefinition().getName()+"_"+aux2[1]+"("+aux2[0]+")";
						}
					}
					aux[j] = "";
					result += aux2[1];
				}
				if (aux[j].contains("if")) {
					ArrayList<String> out = new ArrayList<String>();
					ArrayList<String> outElse = new ArrayList<String>();
					boolean afterElse = false;
					String stmtOut = "";
					String stmtOutElse = "";
					for (int k = j+1; k < aux.length; k++) {
						if (aux[k].contains(")")) {
							aux[k] += " then ";
						}
						if (executable.getReturnType() instanceof DataTypeDef) {
							for (int h = k; h < aux.length; h++) {
								if (aux[k].equals("else")) {
									afterElse = true;
								}
								if (afterElse) {
									if (aux[k].contains("=")) {
										aux[k-1] = " ";
										aux[k] = " ";
										if (aux[k+1].contains("::")) {
											outElse.add( aux[k+1].substring(aux[k+1].lastIndexOf("::")+2));
											aux[k+1] = "";
										}									
									}
									if (aux[k].equals("}")) {
										aux[k] = "";
									}
								}
								else {
									if (aux[k].contains("=")) {
										aux[k-1] = " ";
										aux[k] = " ";
										if (aux[k+1].contains("::")) {
											out.add( aux[k+1].substring(aux[k+1].lastIndexOf("::")+2));
											aux[k+1] = "";
										}									
									}
									if (aux[k].equals("}")) {
										aux[k] = "";
									}
								}								
							}
							
						}							
					}
					for (int w = 0; w < out.size() ; w++) {
						if (w == out.size()-1) {
							stmtOut += out.get(w);
						}
						else
							stmtOut += out.get(w)+",";
					}
					if (stmtOut != "") {
						stmtOut =  "(" + stmtOut + ")";
					}
					for (int w = 0; w < outElse.size() ; w++) {
						if (w == outElse.size()-1) {
							stmtOutElse += outElse.get(w);
						}
						else
							stmtOutElse += outElse.get(w)+",";
					}
					if (stmtOutElse != "") {
						stmtOutElse =  "(" + stmtOutElse + ")";
					}
					for (int k = 0; k < aux.length; k++) {
						if (aux[k].contains("then")) {
							aux[k] += stmtOut; 
						}
						if (aux[k].contains("else")) {
							aux[k] += stmtOutElse; 
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
					for (int k = 0; k < aux.length; k++) {
						aux[k] = "";
					}
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
	
	public String getActionBody(ActivityDef activity, ActionUse action) {
		String result = "";
		result += getParamIn(action, true);
		result += getParamOut(activity, action);
		result += ": {x | x <- " + getDefParamOutAction(action, activity.getBody().getFlows()) + ",";
		result += getConstraintFromAction(action);
		result +=  " } @ \n\t\t";
		result += getActionExit(action, activity.getBody().getFlows());
		return result;
	}

	

	private String getActionExit(ActionUse action, EList<ActivityRelation> flows) {
		String out = "";
		for (ActivityRelation activityRelation :flows) {			
			if (activityRelation.getSource() instanceof ActionUse) {
				if (activityRelation.getTarget() instanceof Pin) {
					if (action.getName().equals(((ActionUse)activityRelation.getSource()).getName())) {
						out +=  ((ActionUse)activityRelation.getSource()).getName() + "_" + ((Pin)activityRelation.getTarget()).getName() + "!out ->\n\t\t";
					}
				
				}
			}
			if (activityRelation.getSource() instanceof Pin) {
				if (activityRelation.getTarget() instanceof ActionUse) {
					if (action.getName().equals(((ActionUse)activityRelation.getTarget()).getName())) {
						out += ((Pin)activityRelation.getSource()).getName() + "_" + 
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
	private String getParamIn(ActionUse action, boolean bool) {
		String params = "";
		for (Pin pin : action.getPinIn()) {
			params += pin.getName()+"_"+pin.getDefinition().getName()+ "?" + pin.getName() + "-> \n\t";
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

	
	
	public int getActionListSize(ActivityDef activity) {
		return activity.getBody().getActions().size();
	}
	
	public String getActionFunction(ActivityDef activity, String compUse) {
		String result = "";
		int cont =1;
		for (ActionUse action : activity.getBody().getActions()) {
			result += compUse+"_"+activity.getName()+"_Func("+ Integer.toString(cont)+ ")= ";
			result += action.getName()+ "_" + action.getDefinition().getName()+ "\n";
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
				result += compUse+"_"+activity.getName()+"_Func("+ Integer.toString(cont)+ ") = ";
				result +=  ((Pin)flow.getSource()).getName()+ "_" + activity.getName()+ "\n";
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
			if (((SimplePortDef)portUse.getDefinition()).getFlowProperties().getLiteral().equalsIgnoreCase("in")) {
				result += conn.getName()+"teste_"+ portUse.getName() + "_"+ portUse.getDefinition().getName()+ "?" + portUse.getName() + "-> \n";
			}
			if (((SimplePortDef)portUse.getDefinition()).getFlowProperties().getLiteral().equalsIgnoreCase("out")) {
				result += conn.getName()+"teste_"+ portUse.getName() + "_"+ portUse.getDefinition().getName()+ "!" + portUse.getName() + "-> \n";
			}
		}
		
		return result;
	}
	
	public String getPortAndPinConnIn(ConnectorUse conn, Pin pin) {
		String result = "";
		for (ConnectorBinding bind : conn.getBindings()) {
			if (conn.getName().equalsIgnoreCase("c1")) {
				result += "s1_"+ getPortPinIN(bind);
			}
			else
				result += "s2_"+ getPortPinIN(bind);
			
		}
		
		return result;
	}
	
	public String getPortAndPinConnOut(ConnectorUse conn, Pin pin) {
		String result = "";
		for (ConnectorBinding bind : conn.getBindings()) {
			
			result += "rtc_"+ getPortPinOUT(bind);
		}
		
		return result;
	}
	
	private String getPortPinIN(ConnectorBinding bind) {
		return bind.getSource().getName() + "_"+ bind.getSource().getDefinition().getName();
	}
	
	private String getPortPinOUT(ConnectorBinding bind) {
		return bind.getDestination().getName() + "_"+ bind.getDestination().getDefinition().getName();
	}
	
	public String getTypePort(PortUse port) {		
		return getTypeCSP(((SimplePortDef)port.getDefinition()).getFlowType());
	}
	
	public String getTypeCSP(TypeDef type) {
		switch (type.getName()) {
		case "Int":			
			return "{0 .. 5}";//"Int";
		case "Boolean":
			return "Bool";
		case "String":			
			return "String\n";
		case "Real":
			return "{32 .. 41}";//"Int";//"{(x,y) | x -> Int, y ->Int}";
		default:
			return type.getName();
		}
	}
	
	public String ExistStringType(Package pck) {
		for (ElementDef elem : pck.getDefinitions()) {
			if (elem instanceof UnitDef) {
				for (ElementDef type : pck.getDefinitions()) {
					if (type instanceof TypeDef) {
						if ((((UnitDef)elem).getName() + "" + ((UnitDef)elem).getDimension().getName()).equals(((TypeDef)type).getName())) {
							String value = getTypeUnity((TypeDef)type);
							if(value.equalsIgnoreCase("String")) {
								return stringType(true);
							}
						}
					}
				}
			}
		}
		
		return null;
	}
	
	public String stringType(boolean isString) {
		if(isString) {
			String str = "MAX = 4\r\n" + 
					"\r\n" + 
					"SysADLChar = {'a','b','c'}\r\n" + 
					"\r\n" + 
					"FSeq(T,0) = {<>}\r\n" + 
					"FSeq(T,1) = union( FSeq(T,0), {<z> | z <- T} )\r\n" + 
					"FSeq(T,s) = {z^z'| z <- FSeq(T,1), z' <- FSeq(T,s-1)}\r\n" + 
					"\r\n" + 
					"String = FSeq(SysADLChar,MAX)\n";			
			return str;
		}
		return null;
	}
	
	public String getTypePin(Pin pin) {		
		return getTypeCSP(pin.getDefinition());
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
	
	public String getTypeUnity(TypeDef typeDef) {		
		TypeDef type = typeDef;
		int cont =0;
		while (! (((ValueTypeDef)type).getSuperType() == null) && cont < 100) {
			type = ((ValueTypeDef)type).getSuperType();			
		}
		
		return getTypeCSP(type);
	}
	
	public String getRenamePortsDelegation(Delegation delegation , ComponentUse compUse ) {
		String result = "";
		Object[] portUse = compUse.getPorts().toArray();
		Object[] portDef = compUse.getDefinition().getPorts().toArray();
		
		result += ((PortUse)delegation.getDestination()).getName().toString();
		result += "_"+((PortUse)delegation.getDestination()).getDefinition().getName().toString();
		result += " <- ";
		for (int i = 0; i < portDef.length; i++) {
			if (((PortUse)portDef[i]).getName().equals(((PortUse)delegation.getDestination()).getName().toString())) {
				result += compUse.getName()+"_";
				result += ((PortUse) portUse[i]).getName().toString();
				result += "_"+((PortUse) portUse[i]).getDefinition().getName().toString();
			}
		}
		
		
		return result;
	}
	
	public String getRenamePortsComponent(ComponentUse compUse) {
		String result = "";
		Object[] portUse = compUse.getPorts().toArray();
		Object[] portDef = compUse.getDefinition().getPorts().toArray();
	
		for (int i = 0; i < portDef.length; i++) {
			if (i < portDef.length-1) {
				result += ((PortUse) portDef[i]).getName().toString();
				result += "_"+((PortUse) portDef[i]).getDefinition().getName().toString();
				result += " <- ";
				result += compUse.getName()+"_";
				result += ((PortUse) portUse[i]).getName().toString();
				result += "_"+((PortUse) portUse[i]).getDefinition().getName().toString();
				result += ", ";
			}
			else {
				result += ((PortUse) portDef[i]).getName().toString();
				result += "_"+((PortUse) portDef[i]).getDefinition().getName().toString();
				result += " <- ";
				result += compUse.getName()+"_";
				result += ((PortUse) portUse[i]).getName().toString();		
				result += "_"+((PortUse) portUse[i]).getDefinition().getName().toString();
				
				
			}
			
		}
		
		return result;
	}
	
	public String getRenamePortsComponent(ComponentUse compUse, ComponentDef compDef) {
		String result = "";
		boolean d = false;
		Object[] portUse = compUse.getPorts().toArray();
		Object[] portDef = compUse.getDefinition().getPorts().toArray();
		Object[] delegations = compDef.getComposite().getDelegations().toArray();
		for (int i = 0; i < portDef.length; i++) {
			if (i < portDef.length-1) {
				result += ((PortUse) portDef[i]).getName().toString();
				result += "_"+((PortUse) portDef[i]).getDefinition().getName().toString();
				result += " <- ";
				for (Object del : delegations) {
					if (((Delegation)del).getSource().equals((PortUse) portUse[i])) {
						d = true;
						result += ((Delegation)del).getDestination().getName();
						result += "_"+ ((Delegation)del).getDestination().getDefinition().getName();
						result += ", ";	
						break;
					}
				}
				if (!d) {
					result += compUse.getName()+"_";
					result += ((PortUse) portUse[i]).getName().toString();
					result += "_"+((PortUse) portUse[i]).getDefinition().getName().toString();
					result += ", ";	
				}				
				d = false;
			}
			else {
				result += ((PortUse) portDef[i]).getName().toString();
				result += "_"+((PortUse) portDef[i]).getDefinition().getName().toString();
				result += " <- ";
				for (Object del : delegations) {
					if (((Delegation)del).getSource().equals((PortUse) portUse[i])) {
						d = true;
						result += ((Delegation)del).getDestination().getName();
						result += "_"+ ((Delegation)del).getDestination().getDefinition().getName();
						break;
					}
				}
				if (!d) {
					result += compUse.getName()+"_";
					result += ((PortUse) portUse[i]).getName().toString();
					result += "_"+((PortUse) portUse[i]).getDefinition().getName().toString();
				}
				d = false;
			}
			
		}
		
		return result;
	}
	
	public String getRenamePortsConnector(ConnectorUse connUse, ComponentDef compDef) {
		String result ="";
		String IN = "";
		String OUT = "";
		String aux = "";
		ArrayList<String> compIN = new ArrayList<String>();
		ArrayList<String> compOUT = new ArrayList<String>();
		ArrayList<String> compIN_use = new ArrayList<String>();
		ArrayList<String> compOUT_use = new ArrayList<String>();
		
		for (int i = 0; i < connUse.getDefinition().getPorts().size(); i++) {
			if(connUse.getDefinition().getPorts().get(i).getDefinition() instanceof SimplePortDef) {
				if (((SimplePortDef)connUse.getDefinition().getPorts().get(i).getDefinition()).getFlowProperties().toString().contains("in")) {
					IN += connUse.getDefinition().getPorts().get(i).getName();
					IN += "_"+connUse.getDefinition().getPorts().get(i).getDefinition().getName();
					IN += " <- ";
				}
				else if(((SimplePortDef)connUse.getDefinition().getPorts().get(i).getDefinition()).getFlowProperties().toString().contains("out")) {
					OUT += connUse.getDefinition().getPorts().get(i).getName();
					OUT += "_"+connUse.getDefinition().getPorts().get(i).getDefinition().getName();
					OUT += " <- ";
				}
			}
			else {				
				for(int j = 0; j < ((CompositePortDef)connUse.getDefinition().getPorts().get(i).getDefinition()).getPorts().size(); j++) {					
					if (((SimplePortDef)((CompositePortDef)connUse.getDefinition().getPorts().get(i).getDefinition()).getPorts().get(j).getDefinition()).getFlowProperties().toString().contains("in")) {
						aux += connUse.getDefinition().getPorts().get(i).getName();
						aux += "_"+((CompositePortDef)connUse.getDefinition().getPorts().get(i).getDefinition()).getPorts().get(j).getName();						
						aux += "_"+connUse.getDefinition().getPorts().get(i).getDefinition().getName();
						aux += " <- ";						
						compIN.add(aux);
						System.out.println(compIN);
						aux = "";
					}
					else if(((SimplePortDef)((CompositePortDef)connUse.getDefinition().getPorts().get(i).getDefinition()).getPorts().get(j).getDefinition()).getFlowProperties().toString().contains("out")) {
						aux += connUse.getDefinition().getPorts().get(i).getName();
						aux += "_"+((CompositePortDef)connUse.getDefinition().getPorts().get(i).getDefinition()).getPorts().get(j).getName();
						aux += "_"+connUse.getDefinition().getPorts().get(i).getDefinition().getName();
						aux += " <- ";
						compOUT.add(aux);
						System.out.println(compOUT);
						aux = "";
					}
				}
			}			
		}
		
		for (ComponentUse compUse : compDef.getComposite().getComponents()) {
			for (PortUse port : compUse.getPorts()) {
				if(port.getDefinition() instanceof SimplePortDef) {
					for (int i = 0; i < connUse.getBindings().size(); i++) {
						if (port.getName().equals(connUse.getBindings().get(i).getDestination().getName())) {
							IN += compUse.getName()+"_"+port.getName() +"_"+ port.getDefinition().getName();
						}
						else if (port.getName().equals(connUse.getBindings().get(i).getSource().getName())) {
							OUT += compUse.getName()+"_"+port.getName() +"_"+ port.getDefinition().getName();
						}
					}
				}
				else {
					for(PortUse compPort: ((CompositePortDef)port.getDefinition()).getPorts()) {
						for (int i = 0; i < connUse.getBindings().size(); i++) {
							if (compPort.getName().equals(connUse.getBindings().get(i).getDestination().getName())) {
								aux = compUse.getName()+"_"+port.getName() +"_"+compPort.getName() +"_"+ port.getDefinition().getName();
								compIN_use.add(aux);
								System.out.println(compIN_use);
								aux = "";
							}
							else if (port.getName().equals(connUse.getBindings().get(i).getSource().getName())) {
								aux = compUse.getName()+"_"+port.getName() +"_"+compPort.getName() +"_"+ port.getDefinition().getName();
								compOUT_use.add(aux);
								System.out.println(compOUT_use);
								aux = "";
							}
						}
					}
				}
			}
		}
		System.out.println("TAMANHO: "+compIN.size());
		System.out.println("TAMANHO: "+compOUT.size());
		System.out.println("TAMANHO: "+compIN_use.size());
		System.out.println("TAMANHO: "+compOUT_use.size());
		if(compIN.size() > 0) {
			for(int i =0; i < compIN.size(); i++) {
				result += compIN.get(i);
//				result += compIN_use.get(i);
				result += ",";
				result += compOUT.get(i);
				result += compOUT_use.get(i);
				result += ",";
			}
		}else {
			result = IN + "," + OUT;
		}		
		return result;
	}
	
	public String getRenamePortsConnector(ConnectorUse connUse, ConnectorDef connDef) {
		String result ="";
		String IN = "";
		String OUT = "";
		String aux = "";
		
		for (int i = 0; i < connUse.getDefinition().getPorts().size(); i++) {
			if(connUse.getDefinition().getPorts().get(i).getDefinition() instanceof SimplePortDef) {
				if (((SimplePortDef)connUse.getDefinition().getPorts().get(i).getDefinition()).getFlowProperties().toString().contains("in")) {
					IN += connUse.getDefinition().getPorts().get(i).getName();
					IN += "_"+connUse.getDefinition().getPorts().get(i).getDefinition().getName();
					IN += " <- ";
				}
				else if(((SimplePortDef)connUse.getDefinition().getPorts().get(i).getDefinition()).getFlowProperties().toString().contains("out")) {
					OUT += connUse.getDefinition().getPorts().get(i).getName();
					OUT += "_"+connUse.getDefinition().getPorts().get(i).getDefinition().getName();
					OUT += " <- ";
				}
			}		
		}
		for(PortUse port: connDef.getPorts()) {
			if(port.getDefinition() instanceof CompositePortDef) {
				for(PortUse port_aux: ((CompositePortDef)port.getDefinition()).getPorts()) {
					for (int i = 0; i < connUse.getBindings().size(); i++) {
						if (port_aux.getName().equals(connUse.getBindings().get(i).getDestination().getName())) {
							IN += port.getName()+"_"+port_aux.getName() +"_"+ port.getDefinition().getName();
						}
						else if (port_aux.getName().equals(connUse.getBindings().get(i).getSource().getName())) {
							OUT += port.getName()+"_"+port_aux.getName() +"_"+ port.getDefinition().getName();
						}
					}
				}
				
			}
		}
		
		
		result = IN + "," + OUT;
				
		return result;
	}
	
	public String getDefPortComp(Set<org.sysadl.Package> pck ) {
		String result = "teste";
		
		
		return result;
	}
	
	public String ExistEqualsNames(Model model) {
		String result = " ";
		ArrayList<String> names = new ArrayList<String>();
		HashMap<String, String> port_Comp = new HashMap<String, String>();
		for (Package pck : model.getPackages()) {
			for (ElementDef elem : pck.getDefinitions()) {
				if (elem instanceof ComponentDef) {
					for (PortUse portUse : ((ComponentDef)elem).getPorts()) {
						if (!names.contains(portUse.getName().concat("_"+portUse.getDefinition().getName()))) {
							names.add(portUse.getName().concat("_"+portUse.getDefinition().getName()));
							port_Comp.put(portUse.getName().concat("_"+portUse.getDefinition().getName()), elem.getName());
						}
						else {
							result = "Sucess- The port " + portUse.getName() + " : " + portUse.getDefinition().getName() + 
									" exists in the components " + port_Comp.get(portUse.getName().concat("_"+portUse.getDefinition().getName())) + 
									" and " + elem.getName()+". Please, make sure all ports have diferrent names.";
							return result;
							
						}						
					}					
				}
			}
		}
		result = "Fail- All ports have a unique name";
		return result;			
	}
	
	public String CheckPortsAndPinsNames(Model model) {
		boolean result = false;
		ArrayList<String> names = new ArrayList<String>();
		for (Allocation allocation : model.getAllocation().getAllocs()) {
			if (allocation instanceof ActivityAllocation) {				
				if (((ActivityAllocation) allocation).getTarget() instanceof ComponentDef) {
					for (PortUse portUse : ((ComponentDef)((ActivityAllocation) allocation).getTarget()).getPorts()) {
						names.add(portUse.getName());
					}
					for (Pin pin : ((ActivityAllocation) allocation).getSource().getInParameters()) {						
						if (names.contains(pin.getName())) {
							result = true; 
						}
						else {
							result = false;
							return "Fail- The PIN " + pin.getName() + " of Activity "+
									((ActivityAllocation) allocation).getSource().getName()+
									" does not exist in the set of ports " + names.toString() +" of ComponentDef " + 
									((ActivityAllocation) allocation).getTarget().getName()+".";
						}
							
					}
					for (Pin pin : ((ActivityAllocation) allocation).getSource().getOutParameters()) {						
						if (names.contains(pin.getName())) {
							result = true; 
						}
						else {
							result = false;
							return "Fail- The PIN " + pin.getName() + " of Activity "+
							((ActivityAllocation) allocation).getSource().getName()+
							" does not exist in the set of ports " + names.toString() +" of ComponentDef " + 
							((ActivityAllocation) allocation).getTarget().getName()+".";
						}
					}
				}				
				names.clear();
			}
		}
		
		return "Sucess- All PINS are OK.";
	}
	
	public String getCompUse(Model model, ComponentDef compDef){
		for (Package pck : model.getPackages()) {
			for (ElementDef elem : pck.getDefinitions()) {
				if (elem instanceof ComponentDef) {
					if (((ComponentDef)elem).getComposite() != null) {
						for (ComponentUse compUse : ((ComponentDef)elem).getComposite().getComponents()) {
							if (compUse.getDefinition().equals(compDef)) {
								return compUse.getName();
							}
						}
					}
					
				}
			}
		}
		return null; 
	}
	
	public String getPortsCompUse(ComponentUse compUse) {
		String result = "";
		
		for (PortUse portUse : compUse.getPorts()) {
			if (portUse.getDefinition() instanceof SimplePortDef) {
				result += "channel "+ compUse.getName()+"_"+portUse.getName()+"_"+portUse.getDefinition().getName()+" : "+getTypePort(portUse)+"\n";
			}else if (portUse.getDefinition() instanceof CompositePortDef) {
				for (PortUse compPortUse : ((CompositePortDef)portUse).getPorts()) {
					result += "channel "+ compUse.getName()+"_"+portUse.getName()+"_"+compPortUse.getName()+"_"+portUse.getDefinition().getName()+" : "+getTypePort(compPortUse)+"\n";
				}				
			}
		}
		return result;
	}
	
	public String getPortsActivities(Package pck , StructuralDef structure , Allocation alloc ) {
		String result = "";
		if (structure instanceof ComponentDef) {
			for (ElementDef elem : pck.getDefinitions()) {
				if (elem instanceof ComponentDef) {
					if (((ComponentDef)elem).getComposite() != null) {
						for (ComponentUse compUse : ((ComponentDef)elem).getComposite().getComponents()) {
							if (((ComponentDef)structure).equals(compUse.getDefinition())) {
								for (PortUse portUse : compUse.getPorts()) {
									if (portUse.equals(compUse.getPorts().get(compUse.getPorts().size()-1))) {
										result += compUse.getName()+"_"+portUse.getName().toString()+"_"+portUse.getDefinition().getName().toString();
									}
									else
										result += compUse.getName()+"_"+portUse.getName().toString()+"_"+portUse.getDefinition().getName().toString()+" , ";								
								}
							}
						}
					}
				}
			}
		}
		else if (structure instanceof ConnectorDef) {
			for (ElementDef elem : pck.getDefinitions()) {
				if (elem instanceof ComponentDef) {
					if (((ComponentDef)elem).getComposite() != null) {
						for (ConnectorUse connUse : ((ComponentDef)elem).getComposite().getConnectors()) {
							if (((ConnectorDef)structure).equals(connUse.getDefinition())) {								
								for (ComponentUse compUse : ((ComponentDef)elem).getComposite().getComponents()) {
									for (PortUse port : compUse.getPorts()) {
										for (int i = 0; i < connUse.getBindings().size(); i++) {										
											if (port.getName().equals(connUse.getBindings().get(i).getDestination().getName())) {
												result += compUse.getName()+"_"+port.getName() +"_"+ port.getDefinition().getName()+",";
											}
											else if (port.getName().equals(connUse.getBindings().get(i).getSource().getName())) {
												result += compUse.getName()+"_"+port.getName() +"_"+ port.getDefinition().getName()+",";
											}											
										}
										
									}
								}
							}
							
						}
						
					}
				}
			}
		}
		return (String) result.subSequence(0, result.lastIndexOf(","));
	}
	
	
	public String getPortUseFromPinSpec(Pin pin, Model model) {
		String result = "";
		for (Package pck : model.getPackages()) {
			for (ElementDef elem : pck.getDefinitions()) {
				if (elem instanceof ComponentDef) {
					if (((ComponentDef)elem).getComposite() != null && isEmpty_Delegations(((ComponentDef)elem).getComposite())) {
						for (ComponentUse compUse : ((ComponentDef)elem).getComposite().getComponents()) {
							for (PortUse portUse : compUse.getPorts()) {
								if (pin.getName().equals(portUse.getName())) {
									result += compUse.getName() + "_" + pin.getName() + "_"+ portUse.getDefinition().getName(); 
								}
							}
						}
					}
				}
			}
		}
		return result;
	}
	
	public String getArchitectureName(Model model ) {
		String result = ""; 
		for (Package pck : model.getPackages()) {
			for (ElementDef elem : pck.getDefinitions()) {
				if (elem instanceof ComponentDef) {
					if (((ComponentDef)elem).getComposite() != null && isEmpty_Delegations(((ComponentDef)elem).getComposite())) {
						result += ((ComponentDef)elem).getName(); 
					}
				}
			}
		}
		return result;
	}
	
	
	public boolean isPinFromPortIn(Pin pin, Model model) {
		String result = "";
		for (Package pck : model.getPackages()) {
			for (ElementDef elem : pck.getDefinitions()) {
				if (elem instanceof ComponentDef) {
					if (((ComponentDef)elem).getComposite() != null && isEmpty_Delegations(((ComponentDef)elem).getComposite())) {
						for (ComponentUse compUse : ((ComponentDef)elem).getComposite().getComponents()) {
							for (PortUse portUse : compUse.getPorts()) {
								if (pin.getName().equals(portUse.getName())) {
									if (((SimplePortDef)portUse.getDefinition()).getFlowProperties().getLiteral().equalsIgnoreCase("out")) {
										return true;
									} 
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	public int existPinOfPortOPT(ActionDef action, Model model) {
		ArrayList<Boolean> ports = new ArrayList<Boolean>();
		//pin of port In : false
		//pin of port out : true
		for (Pin pin : action.getInParameters()) {
			if (!isPinFromPortIn(pin, model)) {
				ports.add(true);
			}
			else
				ports.add(false);
		}
		
		// do not exist port OUT
		if (!ports.contains(true)) {
			return 1;
		}
		// do not exist port IN
		else if (!ports.contains(false)) {
			return 0;
		}
		return 2;
	}
	
	public String getDefaultValueType(Pin pin) {
		String result = "";		
		switch (pin.getDefinition().getName()) {
		case "Boolean":
			return "false";
		case "Int":
			return "0";
		case "Real":
			return "0";
		case "String":
			return "test";
		case "Char":
			return "a";		
		default:
			TypeDef type = pin.getDefinition();
			int cont =0;
			if (type instanceof Enumeration) {
				return ((EnumerationImpl)type).getLiterals().get(((EnumerationImpl)type).getLiterals().size()-1).getName();
				
			}
			else {
				while (! (((ValueTypeDef)type).getSuperType() == null) && cont < 100) {
					type = ((ValueTypeDef)type).getSuperType();			
				}
			}
			pin.setDefinition(type);
			return getDefaultValueType(pin);
		}		
	}
	
	public String getChannelActionUse(ActivityDef b) {
		String result = "";
		ArrayList<ActionUse> channels = new ArrayList<ActionUse>();
		for (ActivityRelation flow : b.getBody().getFlows()) {
			if (flow.getSource() instanceof ActionUse && flow.getTarget() instanceof Pin && !channels.contains(flow.getSource()) ) {
				channels.add((ActionUse) flow.getSource());		
			}
		}
		
		for (ActionUse action : channels) {
			result += "channel "+ action.getName()+"_result : " + action.getDefinition().getReturnType().getName()+ "\n"; 
		}
		return result;
	}
	
	
	public String getActionFuncProcess(ActivityDef activity) {
		String result = "";
		String name = "Actions_"+activity.getName()+" = ";
		String actionPin_Pin = "";
		boolean first = false;
		for (ActivityRelation flow : activity.getBody().getFlows()) {
			if (flow.getSource() instanceof ActionUse && flow.getTarget() instanceof Pin ) {
				if (!first) {
					first = true;
					result += ((ActionUse)flow.getSource()).getName()+"_"+((ActionUse)flow.getSource()).getDefinition().getName();
				}
				result += "[ "+((ActionUse)flow.getSource()).getName()+"_"+ ((Pin)flow.getTarget()).getName() 
						+" <-> " + ((Pin)flow.getTarget()).getName()+"_"+((Pin)flow.getTarget()).getDefinition().getName()+" ] ";
				for (ActionUse actionUse : activity.getBody().getActions()) {
					if (actionUse.getPinIn().contains(flow.getTarget())) {
						result += actionUse.getName()+"_"+actionUse.getDefinition().getName() + ")\n";
						String aux = "";
						aux = "(" + result;
						result = aux;
					}
				}				
			}						
		}
		for (ActionUse actionUse : activity.getBody().getActions()) {
			if(!result.contains(actionUse.getName()+"_"+actionUse.getDefinition().getName())) {
				result += actionUse.getName()+"_"+actionUse.getDefinition().getName() +"\n";
			}
		}
		
		return result;
	}	
	
	public String getActionFlow(ActivityDef activity) {
		String result = "";
		for (ActivityRelation flow : activity.getBody().getFlows()) {
			if (flow.getSource() instanceof ActionUse && flow.getTarget() instanceof Pin ) {
				return "Actions_"+activity.getName()+"_Flows = ";				
			}
		}				
		return result;
	}
	
	public String getSyncAction(ActivityDef activity) {
		String result = "";
		for (ActivityRelation flow : activity.getBody().getFlows()) {
			if (flow.getSource() instanceof ActionUse && flow.getTarget() instanceof Pin ) {
				return "Sync_"+activity.getName()+"_Actions = ";				
			}
		}				
		return result;
	}
	
	
	public Graph<ComponentUse, DefaultEdge> makeGraphFromComponent(ComponentDef comp){
		ArrayList<ComponentUse> compUse = new ArrayList<ComponentUse>();
		ArrayList<ConnectorUse> connUse = new ArrayList<ConnectorUse>();
		ArrayList<Delegation> delegations = new ArrayList<Delegation>();
		int sizeComponents = 0;				
		SimpleDirectedGraph<ComponentUse , DefaultEdge> graph = new SimpleDirectedGraph<>(DefaultEdge.class);
		if (comp.getComposite() != null) {
			sizeComponents += comp.getComposite().getComponents().size();
			compUse.addAll(comp.getComposite().getComponents());
			for (ComponentUse compU : comp.getComposite().getComponents()) {
				graph.addVertex(compU);				
			}
			connUse.addAll(comp.getComposite().getConnectors());
			delegations.addAll(comp.getComposite().getDelegations());
		}
		for (int i =0; i < sizeComponents ; i++) {
			for(int j = 0; j < sizeComponents; j++) {
				ConnectorUse aux = ContainsConn(connUse, compUse.get(i), compUse.get(j));
				if (aux != null) {									
					graph.addEdge(compUse.get(i), compUse.get(j));									
				}												
			}
		}
		return graph;
	}
	
	public Graph<String, DefaultEdge> makeGraphFromActivity(ActivityDef activity){
		SimpleDirectedGraph<String , DefaultEdge> activityGraph = new SimpleDirectedGraph<>(DefaultEdge.class);
		if (activity.getBody().getActions().size() > 1) {
			for (ActionUse action : activity.getBody().getActions()) {
				activityGraph.addVertex(action.getDefinition().getName());
			}
		}
		else
			activityGraph.addVertex(activity.getBody().getActions().get(0).getDefinition().getName());
		for (ActivityRelation flow : activity.getBody().getFlows()) {
			if (flow.getSource() instanceof ActionUse && flow.getTarget() instanceof Pin) {
				activityGraph.addEdge(((ActionUse)flow.getSource()).getDefinition().getName(), getActionFromPin((Pin) flow.getTarget(), activity.getBody().getFlows()));
			}
		}
		return activityGraph;
	}
	
	public boolean verifyCycleActivity(ActivityDef activity) {
		CycleDetector<String, DefaultEdge> detect = new CycleDetector<>(makeGraphFromActivity(activity));
		if (detect.detectCycles()) 			
			return true;		
		else
			return false;		
	}
	
	public boolean verifyCycleComponent(ComponentDef comp) {
		CycleDetector<ComponentUse, DefaultEdge> detect = new CycleDetector<>(makeGraphFromComponent(comp));
		if (detect.detectCycles()) 			
			return true;		
		else
			return false;		
	}
	
	public String getSequenceFromComponentConfigWithRename(ComponentDef comp) {
		String result = "";
		Graph<ComponentUse, DefaultEdge> g = makeGraphFromComponent(comp);
		SimpleDirectedGraph<ComponentUse,DefaultEdge> aux = new SimpleDirectedGraph<ComponentUse, DefaultEdge>(DefaultEdge.class);
		for (ComponentUse v : g.vertexSet()) {
			aux.addVertex(v);
		}
		for (DefaultEdge e : g.edgeSet()) {
			aux.addEdge(g.getEdgeSource(e), g.getEdgeTarget(e));
		}		
		TopologicalOrderIterator<ComponentUse, DefaultEdge> seq = new TopologicalOrderIterator<>(aux);
		while(seq.hasNext()) {
			ComponentUse next = seq.next();
			if (seq.hasNext() == false) { 
				if (comp.getComposite() != null && isEmpty_Delegations(comp.getComposite()) == false) {
					result += next.getDefinition().getName()+"[[ " + getRenamePortsComponent(next,comp)+" ]]\n\t\t\t\t\t\t";
				}else
					result += next.getDefinition().getName()+"[[ " + getRenamePortsComponent(next)+" ]]\n\t\t\t\t\t\t";
			}
			else {
				if(comp.getComposite() != null && isEmpty_Delegations(comp.getComposite()) == false) {
					result += next.getDefinition().getName()+"[[ " + getRenamePortsComponent(next,comp)+" ]];\n\t\t\t\t\t\t";
				}else
					result += next.getDefinition().getName()+"[[ " + getRenamePortsComponent(next)+" ]];\n\t\t\t\t\t\t";
			}
		}
		return result;
	}
	
	
	public boolean ExistCycle(Model model) {		
		ArrayList<ComponentUse> compUse = new ArrayList<ComponentUse>();
		ArrayList<ConnectorUse> connUse = new ArrayList<ConnectorUse>();
		ArrayList<Delegation> delegations = new ArrayList<Delegation>();
		//ArrayList<ActivityDef>
		int sizeComponents = 0;		
		
		SimpleDirectedGraph<ComponentUse , DefaultEdge> fullMo = new SimpleDirectedGraph<>(DefaultEdge.class);
		SimpleDirectedGraph<ComponentUse, DefaultEdge> florestG = new SimpleDirectedGraph<>(DefaultEdge.class);
		SimpleDirectedGraph<String , DefaultEdge> activityGraph = new SimpleDirectedGraph<>(DefaultEdge.class);
		
		for (Package pck : model.getPackages()) {
			for (ElementDef elem : pck.getDefinitions()) {
				if (elem instanceof ComponentDef) {
					if (((ComponentDef)elem).getComposite() != null) {
						sizeComponents += ((ComponentDef)elem).getComposite().getComponents().size();
						compUse.addAll(((ComponentDef)elem).getComposite().getComponents());
						for (ComponentUse comp : ((ComponentDef)elem).getComposite().getComponents()) {
							fullMo.addVertex(comp);
							florestG.addVertex(comp);
						}
						connUse.addAll(((ComponentDef)elem).getComposite().getConnectors());
						delegations.addAll(((ComponentDef)elem).getComposite().getDelegations());
					}
				}
				else if(elem instanceof ActivityDef) {					
					if (((ActivityDef)elem).getBody().getActions().size() > 1) {
						for (ActionUse action : ((ActivityDef)elem).getBody().getActions()) {
							activityGraph.addVertex(action.getDefinition().getName());
						}
					}
					else
						activityGraph.addVertex(((ActivityDef)elem).getBody().getActions().get(0).getDefinition().getName());
					for (ActivityRelation flow : ((ActivityDef)elem).getBody().getFlows()) {
						if (flow.getSource() instanceof ActionUse && flow.getTarget() instanceof Pin) {
							activityGraph.addEdge(((ActionUse)flow.getSource()).getDefinition().getName(), getActionFromPin((Pin) flow.getTarget(), ((ActivityDef)elem).getBody().getFlows()));
						}
					}
				}
			}
		}		
		for (int i =0; i < sizeComponents ; i++) {
			for(int j = 0; j < sizeComponents; j++) {
				ConnectorUse aux = ContainsConn(connUse, compUse.get(i), compUse.get(j));
				if (aux != null) {									
					florestG.addEdge(compUse.get(i), compUse.get(j));
					PortUse portAux = HaveDelegation(aux, delegations);
					PortUse portAuxOUT = HaveDelegationINV(aux, delegations);
					if (portAux != null) {					
						for (ComponentUse comp : compUse) {
							if (comp.getPorts().contains(portAux)) {								
								fullMo.addEdge(compUse.get(i), compUse.get(compUse.lastIndexOf(comp)));								
							}
						}
					}
					else if(portAuxOUT != null) {
						for (ComponentUse comp : compUse) {
							if (comp.getPorts().contains(portAuxOUT)) {								
								fullMo.addEdge(compUse.get(compUse.lastIndexOf(comp)), compUse.get(j));								
							}
						}
					}
					else {						
						fullMo.addEdge(compUse.get(i), compUse.get(j));
					}
				}												
			}
		}
		CycleDetector<ComponentUse, DefaultEdge> detect = new CycleDetector<>(fullMo);
		CycleDetector<ComponentUse, DefaultEdge> detect2 = new CycleDetector<>(florestG);
		CycleDetector<String, DefaultEdge> activity = new CycleDetector<>(activityGraph);
//		printGraph(fullMo);
//		printGraph(florestG);
//		printGraph(activityGraph);
				
		BiconnectivityInspector<ComponentUse, DefaultEdge> sc = new BiconnectivityInspector<>(florestG);	
		for (Graph<ComponentUse, DefaultEdge> g : sc.getConnectedComponents()) {			
			getSeqComponents(g);
		}		
		if (detect.detectCycles() && detect2.detectCycles() && activity.detectCycles()) 			
			return true;		
		else
			return false;
	}
	
	private void getSeqComponents(Graph<ComponentUse, DefaultEdge> g) {
		SimpleDirectedGraph<ComponentUse,DefaultEdge> aux = new SimpleDirectedGraph<ComponentUse, DefaultEdge>(DefaultEdge.class);
		for (ComponentUse v : g.vertexSet()) {
			aux.addVertex(v);
		}
		for (DefaultEdge e : g.edgeSet()) {
			aux.addEdge(g.getEdgeSource(e), g.getEdgeTarget(e));
		}		
		TopologicalOrderIterator<ComponentUse, DefaultEdge> seq = new TopologicalOrderIterator<>(aux);
		while(seq.hasNext()) {
			//System.out.println(seq.next());
		}
		return;
	}
	
	private void printGraph(Graph<ComponentUse, DefaultEdge> g) {
		DOTExporter<String, DefaultEdge> exporter =
	            new DOTExporter<>(v -> v);
//	        exporter.setVertexAttributeProvider((v) -> {
//	            Map<String, Attribute> map = new LinkedHashMap<>();
//	            map.put("label", DefaultAttribute.createAttribute(v.toString()));
//	            return map;
//	        });
//	        Writer writer = new StringWriter();
//	        exporter.exportGraph(g, writer);
//	        System.out.println(writer.toString());
	}
	
	private ConnectorUse ContainsConn(ArrayList<ConnectorUse> conns, ComponentUse source, ComponentUse target) {
		for (ConnectorUse connectorUse : conns) {
			if (source.getPorts().contains(((ConnectorBinding)connectorUse.getBindings().get(0)).getSource()) && 
					target.getPorts().contains(((ConnectorBinding)connectorUse.getBindings().get(0)).getDestination())) {
				return connectorUse;
			}
		}		
		return null;
	}	
	
	private PortUse HaveDelegation( ConnectorUse connector, ArrayList<Delegation> delegations) {		
			for (Delegation del : delegations) {				
				if (del.getDestination().getName().equals(((ConnectorBinding)connector.getBindings().get(0)).getDestination().getName())) {
					return del.getSource();
				}		
		}		
		return null;
	}
	
	private PortUse HaveDelegationINV( ConnectorUse connector, ArrayList<Delegation> delegations) {		
		for (Delegation del : delegations) {				
			if (del.getDestination().getName().equals(((ConnectorBinding)connector.getBindings().get(0)).getSource().getName())) {
				return del.getSource();
			}		
	}		
	return null;
}
}
