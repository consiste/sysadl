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

	private OCLHelper<?, ?, ?, ?> helper; 
	private OCL<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ocl;
	
	
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
			System.out.println("Verification ["+c.getName()+"]: Checking Style "+s.getName());
			for (Invariant i : s.getInvariants()) {
				System.out.println("Verification ["+c.getName()+"]: Checking invariant "+i.getName());
				try {
					System.out.println("Invariant "+i.getName()+(i.getExpr()==null? ": " : " ("+i.getExpr()+"): ")+(checkInvariant(c,i.getExpr())? "valid" : "violated"));
				} catch (ParserException e) {
					System.out.println("[ERROR] Invariant "+i.getName()+ " has shown an error: "+e.getMessage());
				}

			}
			System.out.println("Verification ["+c.getName()+"]: End verification of style "+s.getName());
		}
	}

	private boolean checkInvariant(ComponentDef c, String expr) throws ParserException {
		if (expr==null || expr.isBlank()) return true;
		EcoreEnvironmentFactory fac = new EcoreEnvironmentFactory();
		ocl = OCL.newInstance(fac);
		
		helper = ocl.createOCLHelper();
		helper.setInstanceContext(SysADLPackage.CONFIGURATION);
		
		OCLExpression query = (OCLExpression) helper.createInvariant(expr);
		Query<EClassifier, EClass, EObject> eval = ocl.createQuery(query);
		return eval.check(c.getComposite());
	}

}
