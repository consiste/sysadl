package org.sysadl.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.sysadl.aspects.SysADLStatementInterpreter;
import org.sysadl.context.SysADLContext;
import org.sysadl.context.exceptions.ContextInvalidKey;
import org.sysadl.context.impl.SysADLContextImpl;

import sysADL_Sintax.NamedElement;
import sysADL_Sintax.SysADLFactory;
import sysADL_Sintax.TypeDef;
import sysADL_Sintax.TypeUse;
import sysADL_Sintax.VariableDecl;
import sysADL_Sintax.impl.SysADLFactoryImpl;

class StatementTest {
	private SysADLStatementInterpreter subject;
	private SysADLContext context;
	
	/**
	 * Init context with this values:
	 * x = 2
	 * y = "test
	 * z = 2.5
	 * w = null
	 * @param target
	 */
	private void init(SysADLContext target) {
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
	void init() {
		// init a context model
		context = new SysADLContextImpl();
		init(context);
		
		// retrieves instance of SysADLStatementInterpreter
		//subject = new ...
	}
	
	@Test
	void testVariableDeclaration() {
		TypeDef t = SysADLFactory.eINSTANCE.createValueTypeDef();
		t.setName("Integer");
		VariableDecl a = SysADLFactory.eINSTANCE.createVariableDecl();
		a.setName("newVar");
		a.setValue(null);
		a.setDefinition(t);
		
		//this.subject.run(a, this.context);
		SysADLContext expectedContext = new SysADLContextImpl(); 
		init(expectedContext);
		VariableDecl newVar = SysADLFactory.eINSTANCE.createVariableDecl();
		newVar.setName("newVar");
		expectedContext.add(newVar, null);

		assertEquals(expectedContext.size(), context.size());
		
		for (String key : context.keys()) {
			try {
				Object v = context.findByName(key);
				assertTrue(context.keys().contains(key));
				assertEquals(expectedContext.findByName(key), v);
			} catch (ContextInvalidKey e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	@Test
	void testBlockStatement() {
		
	}
	
	@Test
	void testWhileStatement() {
		
	}
	@Test
	void testDoStatement() {
		
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
