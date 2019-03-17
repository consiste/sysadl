package org.sysadl.execution;

import org.eclipse.emf.common.util.BasicEList;

import sysADL_Sintax.ActivityDef;

public class ExecutionCore {
	public void Execute(ActivityDef a) {
		ActivityBodyAspect.init(a.getBody(), new BasicEList<String>());
	}
}
