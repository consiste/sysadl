package org.sysadl.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.sysadl.aspects.SysADLStatementInterpreter;
import org.sysadl.context.SysADLContext;
import org.sysadl.context.exceptions.ContextException;
import org.sysadl.context.exceptions.ContextInvalidKey;
import org.sysadl.context.impl.SysADLContextImpl;

import sysADL_Sintax.BlockStatement;
import sysADL_Sintax.BooleanLiteralExpression;
import sysADL_Sintax.DoStatement;
import sysADL_Sintax.Expression;
import sysADL_Sintax.NamedElement;
import sysADL_Sintax.SysADLFactory;
import sysADL_Sintax.TypeDef;
import sysADL_Sintax.TypeUse;
import sysADL_Sintax.VariableDecl;
import sysADL_Sintax.WhileStatement;
import sysADL_Sintax.impl.SysADLFactoryImpl;

class StatementTest {
	private SysADLStatementInterpreter subject;
	private SysADLContext context;
	private TypeDef typeInt;
	private SysADLFactory factory = SysADLFactory.eINSTANCE;
	
	/**
	 * Init context with this values:
	 * x = 2
	 * y = "test
	 * z = 2.5
	 * w = null
	 * @param target
	 */
	public void init(SysADLContext target) {
		TypeDef t = SysADLFactory.eINSTANCE.createValueTypeDef();
		t.setName("Integer");
		
		target.clear(); // just to be sure
		// add some variables
		// x = 2
		SysADLFactory factory = SysADLFactoryImpl.eINSTANCE;
		TypeUse t1 = factory.createTypeUse();
		t1.setName("x");
		t1.setDefinition(t);
		target.add(t1, 2);
		// y = "test"
		
		TypeUse t2 = factory.createTypeUse();
		t2.setName("y");
		t2.setDefinition(t);
		target.add(t2, "test");
		// z = 2.5
		TypeUse t3 = factory.createTypeUse();
		t3.setName("z");
		t3.setDefinition(t);
		target.add(t3, 2.5);
		// w = null
		TypeUse t4 = factory.createTypeUse();
		t4.setName("w");
		t4.setDefinition(t);
		target.add(t4, null);
	}
	
	@Before
	public void init() {
		// init a context model
		context = new SysADLContextImpl();
		init(context);
		
		typeInt = SysADLFactory.eINSTANCE.createValueTypeDef();
		typeInt.setName("Integer");
		// retrieves instance of SysADLStatementInterpreter
		//subject = new ...
	}
	
	@Test
	public void testVariableDeclaration() {
		VariableDecl a = factory.createVariableDecl();
		a.setName("newVar");
		a.setValue(null);
		a.setDefinition(typeInt);
		
		
		SysADLContext expectedContext = new SysADLContextImpl(); 
		init(expectedContext);
		VariableDecl newVar = factory.createVariableDecl();
		newVar.setName("newVar");
		newVar.setDefinition(typeInt);
		newVar.setValue(null);

		expectedContext.add(newVar, null);
		try {
			this.subject.run(a, this.context);
	
			assertEquals(expectedContext.size(), context.size());
			
			for (String key : context.keys()) {
				Object v = context.findByName(key);
				assertTrue(context.keys().contains(key));
				assertEquals(expectedContext.findByName(key), v);
			} 
		} catch (ContextException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Block with a variable decl inside
	 */
	@Test
	public void testBlockStatement() {
		VariableDecl a = factory.createVariableDecl();
		a.setName("newVar");
		a.setValue(null);
		a.setDefinition(typeInt);
		
		BlockStatement b = factory.createBlockStatement();
		b.getBody().add(a);
		
		SysADLContext expectedContext = new SysADLContextImpl(); 
		init(expectedContext);
		VariableDecl newVar = factory.createVariableDecl();
		newVar.setName("newVar");
		newVar.setDefinition(typeInt);
		newVar.setValue(null);

		expectedContext.add(newVar, null);

		try {
			subject.run(b, context);
			assertEquals(expectedContext.size(), context.size());
			for (String key : context.keys()) {
				Object v = context.findByName(key);
				assertTrue(context.keys().contains(key));
				assertEquals(expectedContext.findByName(key), v);
			}
		} catch (ContextException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test
	public void testWhileStatement() {
		WhileStatement w = factory.createWhileStatement();
		BooleanLiteralExpression condition = factory.createBooleanLiteralExpression();
		condition.setIsTrue(false);
		
		VariableDecl a = factory.createVariableDecl();
		a.setName("newVar");
		a.setValue(null);
		a.setDefinition(typeInt);
		
		w.setBody(a);
		
		SysADLContext expectedContext = new SysADLContextImpl(); 
		init(expectedContext);
		
		try {
			subject.run(w, context);
			assertEquals(expectedContext.size(), context.size());
			for (String key : context.keys()) {
				Object v = context.findByName(key);
				assertTrue(context.keys().contains(key));
				assertEquals(expectedContext.findByName(key), v);
			}
		} catch (ContextException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testDoStatement() {
		DoStatement w = factory.createDoStatement();
		BooleanLiteralExpression condition = factory.createBooleanLiteralExpression();
		condition.setIsTrue(false);
		
		VariableDecl a = factory.createVariableDecl();
		a.setName("newVar");
		a.setValue(null);
		a.setDefinition(typeInt);
		
		w.setBody(a);
		
		SysADLContext expectedContext = new SysADLContextImpl(); 
		init(expectedContext);
		
		try {
			subject.run(w, context);
			assertEquals(expectedContext.size(), context.size());
			for (String key : context.keys()) {
				Object v = context.findByName(key);
				assertTrue(context.keys().contains(key));
				assertEquals(expectedContext.findByName(key), v);
			}
		} catch (ContextException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testForStatement() {

	}
	
	@Test
	void testSwitchStatement() {
		
	}
	@Test
	void testIfBlockStatement() {
		
	}
}
