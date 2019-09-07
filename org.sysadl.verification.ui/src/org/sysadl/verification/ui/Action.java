package org.sysadl.verification.ui;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeListSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.sysadl.AbstractComponentDef;
import org.sysadl.ComponentDef;
import org.sysadl.Configuration;
import org.sysadl.Invariant;
import org.sysadl.Style;
import org.sysadl.SysADLPackage;

public class Action implements IExternalJavaAction {
	
	public Action() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		DNodeListSpec d = (DNodeListSpec) arg1.get("component");
		ComponentDef c = (ComponentDef) d.getTarget();
		//System.out.println(k + ": "+ arg1.get(k));
		
		System.out.println("Starting Verification of Component "+c.getName()+"...");
		List<Style> abs = c.getAppliedStyle();
		if (abs==null || abs.isEmpty()) {
			System.out.println("Component "+c.getName()+" does not follow any style. Verification aborted.");
			return;
		}
		
		for (Style s : abs) {
			int total = s.getInvariants().size();
			int violations = 0;
			boolean isValid;
			System.out.println("Verification ["+c.getName()+"]: Checking Style "+s.getName());
			System.out.println("Number of Invariants: "+s.getInvariants().size());
			for (Invariant i : s.getInvariants()) {
				System.out.println("Verification ["+c.getName()+"]: Checking invariant "+i.getName());
				try {
					isValid = checkInvariant(c,i.getExpr());
					if (!isValid) violations++;
					System.out.println("Invariant "+i.getName()+(i.getExpr()==null? ": " : " ("+i.getExpr()+"): ")+(isValid? "valid" : "violated"));
				} catch (ParserException e) {
					System.out.println("[ERROR] Invariant "+i.getName()+ " has shown an error: "+e.getMessage());
				}

			}
			System.out.println("Verification ["+c.getName()+"]: End verification of style "+s.getName());
			System.out.println("Invariants: "+total+" (total); "+violations+" (violated)");
			System.out.println(((total-violations)/total)*100+"% constraints validated");
		}
	}

	private boolean checkInvariant(ComponentDef c, String expr) throws ParserException {
		if (expr==null || expr.isEmpty()) return true;
		
		OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl;
	    ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	    OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		
		helper = ocl.createOCLHelper();
		helper.setContext(SysADLPackage.Literals.CONFIGURATION);
		
		Constraint query = helper.createInvariant(expr);
		return ocl.check(c.getComposite(), query);
	}

}
