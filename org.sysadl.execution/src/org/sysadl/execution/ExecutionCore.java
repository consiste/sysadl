package org.sysadl.execution;

import org.eclipse.emf.common.util.BasicEList;

import org.sysadl.ActivityDef;

public class ExecutionCore {
	public void Execute(ActivityDef a) {
		ActivityBodyAspect.init(a.getBody(), new BasicEList<String>());
	}
}
