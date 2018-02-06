package org.sysadl.aspects;

import java.util.Map;

import sysADL_Sintax.BlockStatement;
import sysADL_Sintax.DoStatement;
import sysADL_Sintax.Expression;
import sysADL_Sintax.ForStatement;
import sysADL_Sintax.IfBlockStatement;
import sysADL_Sintax.ReturnStatement;
import sysADL_Sintax.Statement;
import sysADL_Sintax.SwitchStatement;
import sysADL_Sintax.VariableDecl;
import sysADL_Sintax.WhileStatement;

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
	
	public void run(Statement s, Map<String, Object> context) {
		// Throw an error, invalid kind of statement
	}
	
	public abstract void run(Expression s,Map<String,Object>context);

	public abstract void run(BlockStatement s,Map<String,Object>context);

	public abstract void run(VariableDecl s,Map<String,Object>context);

	//public abstract void run(ReturnStatement s,Map<String,Object>context);

	public abstract void run(WhileStatement s,Map<String,Object>context);

	public abstract void run(DoStatement s,Map<String,Object>context);

	public abstract void run(ForStatement s,Map<String,Object>context);

	public abstract void run(SwitchStatement s, Map<String, Object> context);
	
	public abstract void run(IfBlockStatement s, Map<String, Object> context);
}
