package org.sysadl.aspects;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.sysadl.context.SysADLContext;

import sysADL_Sintax.AffixOperator;
import sysADL_Sintax.Executable;
import sysADL_Sintax.Expression;
import sysADL_Sintax.IncrementOrDecrementExpression;
import sysADL_Sintax.NameExpression;
import sysADL_Sintax.ReturnStatement;
import sysADL_Sintax.Statement;

/**
 * 
 * This class is responsible for evaluating Expressions and running Executables
 * @author Eduardo
 *
 */
public class SysADLExecutionEngine {
	private SysADLStatementInterpreter interpreter;
	
	/**
	 * Evaluate an expression
	 * @param e SysADL expression
	 * @param context map ID-value with available variables
	 * @return result of the evaluation
	 */
	public Object evaluate(Expression e, SysADLContext context) {
		// TODO implement m
		return null;
	}
	
	/**
	 * Executes an executable
	 * @param e the executable
	 * @param context map ID-value with available variables
	 * @return the result of the execution
	 */
	public Object execute(Executable e, SysADLContext context) {
		EList l = e.getBody();
		for (Object s : e.getBody()) {
			if (s instanceof ReturnStatement) { // only returns if find a return statement
				return evaluate(((ReturnStatement) s).getValue(), context);
			}
			else interpreter.run((Statement)s, context);
		}
		return null;
	}
	
	public Object evaluate(IncrementOrDecrementExpression e, SysADLContext context) {
		// x++
		// LeftHandSize: target = x
		// AffixOperator: AffixOperator.PLUS
		switch (e.getOperator().getValue()) {
			case AffixOperator.DECR:
				Integer o = (Integer) evaluate(e.getOperand().getTarget(), context);
				o--;
				return o;
			case AffixOperator.INCR: break;
			default:
		}
		return null;
	}
	
	public Object evaluate(NameExpression n, SysADLContext context) {
		return context.findByName(n.getCite().getName());
	}
	
	private static SysADLExecutionEngine instance = new SysADLExecutionEngine();
	
	private SysADLExecutionEngine() {
		
	}
	
	public static SysADLExecutionEngine getInstance() {
		return instance;
	}
}
