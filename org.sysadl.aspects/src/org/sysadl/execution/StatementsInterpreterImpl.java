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
		// TODO Auto-generated method stub

	}

	@Override
	public void run(VariableDecl s, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(ReturnStatement s, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(WhileStatement s, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(DoStatement s, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(ForStatement s, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(SwitchStatement s, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub

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
