package org.sysadl.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.sysadl.aspects.SysADLStatementInterpreter;

import sysADL_Sintax.SysADLFactory;
import sysADL_Sintax.TypeDef;
import sysADL_Sintax.VariableDecl;

class StatementTest {
	private SysADLStatementInterpreter subject;
	private Map<String, Object> context;
	
	private void initMap(Map<String, Object> target) {
		target.clear(); // just to be sure
		// add some variables
		// x = 2
		target.put("x", 2);
		// y = "test"
		target.put("y", "test");
		// z = 2.5
		target.put("z", 2.5);
		// w = null
		target.put("w", null);
	}
	
	@Before
	void init() {
		// init a context model
		context = new HashMap<String, Object>();
		initMap(context);
		
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
		Map<String, Object> expectedContext = new HashMap<String, Object>(); 
		initMap(expectedContext);
		expectedContext.put("newVar", null);

		assertEquals(expectedContext, context);
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
