package org.sysadl.execution.statements;

import java.util.Map;

import org.sysadl.context.SysADLContext;
import org.sysadl.context.exceptions.ContextException;
import org.sysadl.execution.engine.SysADLExecutionEngine;
import org.sysadl.execution.statements.types.ControlReturnStatement;

import org.sysadl.BlockStatement;
import org.sysadl.DoStatement;
import org.sysadl.Expression;
import org.sysadl.ForStatement;
import org.sysadl.IfBlockStatement;
import org.sysadl.ReturnStatement;
import org.sysadl.Statement;
import org.sysadl.SwitchStatement;
import org.sysadl.VariableDecl;
import org.sysadl.WhileStatement;

/**
 * SysADL Statement Interpreter
 * @author Eduardo
 * Class responsible for interpret SysADL statements
 * Every method receives a kind of statement and a context
 * The context is the available variables and their respective values
 * Each method must run an statement and do something (or not) with the context
 * IMPORTANT: Think about scoping #Eduardo
 */
public abstract class SysADLStatementInterpreter {
	
	public void run(Statement s, SysADLContext context) throws ContextException {
		if (s instanceof Expression) run((Expression)s, context);
		else if (s instanceof BlockStatement) run((BlockStatement)s, context);
		else if (s instanceof VariableDecl) run((VariableDecl)s, context);
		else if (s instanceof ReturnStatement) run((ReturnStatement)s, context);
		else if (s instanceof WhileStatement) run((WhileStatement)s, context);
		else if (s instanceof DoStatement) run((DoStatement)s, context);
		else if (s instanceof ForStatement) run((ForStatement)s, context);
		else if (s instanceof SwitchStatement) run((SwitchStatement)s, context);
		else if (s instanceof IfBlockStatement) run((IfBlockStatement)s, context);
	}
	
	public void run(Expression s,SysADLContext context) throws ContextException {
		SysADLExecutionEngine.getInstance().evaluate(s, context);
	}

	public abstract void run(BlockStatement s,SysADLContext context) throws ContextException;

	public abstract void run(VariableDecl s, SysADLContext context) throws ContextException;

	// TODO need to be done, will throw an exception that will be handled by the execution engine
	public void run(ReturnStatement s,SysADLContext context) throws ContextException {
		Object value = SysADLExecutionEngine.getInstance().evaluate(s.getValue(), context);
		throw new ControlReturnStatement(value);
	}

	public abstract void run(WhileStatement s,SysADLContext context) throws ContextException;

	public abstract void run(DoStatement s,SysADLContext context) throws ContextException;

	public abstract void run(ForStatement s,SysADLContext context) throws ContextException;

	public abstract void run(SwitchStatement s, SysADLContext context) throws ContextException;
	
	public abstract void run(IfBlockStatement s, SysADLContext context) throws ContextException;
}
