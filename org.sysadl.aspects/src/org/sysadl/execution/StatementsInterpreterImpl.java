package org.sysadl.execution;

import org.sysadl.context.SysADLContext;
import org.sysadl.context.exceptions.ContextException;
import org.sysadl.engine.SysADLExecutionEngine;

import sysADL_Sintax.BlockStatement;
import sysADL_Sintax.DoStatement;
import sysADL_Sintax.Expression;
import sysADL_Sintax.ForStatement;
import sysADL_Sintax.IfBlockStatement;
import sysADL_Sintax.IfStatement;
import sysADL_Sintax.ReturnStatement;
import sysADL_Sintax.SwitchStatement;
import sysADL_Sintax.VariableDecl;
import sysADL_Sintax.WhileStatement;

public class StatementsInterpreterImpl extends SysADLStatementInterpreter {

	@Override
	public void run(Expression s, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(BlockStatement s, SysADLContext context) throws ContextException {
		for (Object o : s.getBody()) {
			Statement a = (Statement) o;
				run(a, context);
		}
	}

	@Override
	public void run(VariableDecl s, SysADLContext context) throws ContextException {
		context.add(s, s.getValue());

	}

	@Override
	public void run(ReturnStatement s, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(WhileStatement s, SysADLContext context) throws ContextException {
		SysADLExecutionEngine a = SysADLExecutionEngine.getInstance();
		while(a.evaluate(s.getCondition(), context) instanceof Boolean && (Boolean)a.evaluate(s.getCondition(), context)) {
			run(s.getBody(), context);
		}
	
	}

	@Override
	public void run(DoStatement s, SysADLContext context) throws ContextException {
		SysADLExecutionEngine a = SysADLExecutionEngine.getInstance();
		
		do {
			run(s.getBody(), context);
		}while(a.evaluate(s.getCondition(), context) instanceof Boolean && (Boolean)a.evaluate(s.getCondition(), context));
	}

	@Override
	public void run(ForStatement s, SysADLContext context) throws ContextException {
		SysADLExecutionEngine a = SysADLExecutionEngine.getInstance();

		// TODO Auto-generated method stub
		VariableDecl va = (VariableDecl) s.getControl().getVars().get(0);
		run(va,context);
		while(true) {
			
				if( a.evaluate((Expression) s.getControl().getVars().get(1), context) instanceof Boolean
						&& ! (Boolean)a.evaluate(((Expression) s.getControl().getVars().get(1)), context) ) {
					break;
				}
				run(s.getBody(), context);
			Expression st = ((Expression) s.getControl().getVars().get(2));
			run(st, context);
		}
	}

	@Override
	public void run(SwitchStatement s, SysADLContext context) throws ContextException {
		String a = s.getExpr().getValue();
		boolean flag = false;
		
		for (Object o : s.getClauses()) {
			
			SwitchClause clause = (SwitchClause) o;
			
			if(a.equals(clause.getValue().getValue())) {
				flag = true;
			}
			if(flag) {
					run(clause.getBody(), context);
			}
		}
	}

	@Override
	public void run(IfBlockStatement s, SysADLContext context) throws ContextException {
		// Retrieve instance of ExecutionEngine
		SysADLExecutionEngine eg = SysADLExecutionEngine.getInstance();
		
		// Save if statement
		IfStatement _if = s.getMain_if();
		
		// Evaluate the condition 
		Object condition = eg.evaluate(_if.getCondition(), context);
		
		// if the condition is true
		if ((condition instanceof Boolean) && (Boolean) condition) {
			run(_if.getBody(), context);
		} else { 
			if (s.getElse()!=null) run(s.getElse().getBody(), context);
		}
	}

}
