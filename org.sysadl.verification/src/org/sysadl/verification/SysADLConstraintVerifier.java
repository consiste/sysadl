package org.sysadl.verification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.ConstraintKind;
import org.eclipse.ocl.helper.OCLHelper;
import org.sysadl.Invariant;
import org.sysadl.Model;
import org.sysadl.SysADLPackage;
import org.sysadl.grammar.util.SysADLGrammarUtil;

public class SysADLConstraintVerifier {
	private Model model;
	private Map<org.sysadl.Package, List<org.sysadl.Invariant>> invariantsPerPackage;
	private Map<org.sysadl.Invariant, Object> invariants;
	private OCLHelper<?, ?, ?, ?> helper; 
	private OCL<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ocl;
	
	public SysADLConstraintVerifier(Model m) {
		this.model = m;
		EcoreEnvironmentFactory fac = new EcoreEnvironmentFactory();
		ocl = OCL.newInstance(fac);
		helper = ocl.createOCLHelper();
		helper.setInstanceContext(SysADLPackage.PACKAGE);
		try {
			initConstraints();
		} catch (ParserException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void initConstraints() throws ParserException {
		
		
		for (org.sysadl.Package p : this.model.getPackages()) {
			List<org.sysadl.Invariant> invariants = SysADLConstraintVerifier.getInvariants(p);
			invariantsPerPackage.put(p, invariants);
			for (Invariant i : invariants) {
				String expr = SysADLGrammarUtil.nodeText(i);
				this.invariants.put(i, helper.createConstraint(ConstraintKind.INVARIANT, expr));
			}
		}
	}

	private static List<Invariant> getInvariants(org.sysadl.Package p) {
		//return p.getAppliedStyle().getInvariants();
		return null;
	}
	
	public void verifyPackage(org.sysadl.Package p) {
		
	}
	
	public void checkAll() throws VerificationException {
		for (Object c : invariants.values()) {
			//helper.createQuery(c);
			//ocl.check(model, c);
		}
		
	}
}
