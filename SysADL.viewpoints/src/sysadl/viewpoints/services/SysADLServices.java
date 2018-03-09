package sysadl.viewpoints.services;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;

import sysADL_Sintax.ConstraintUse;

public class SysADLServices {

	public EObject openTextEditor(EObject any) {
		if (any != null && any.eResource() instanceof XtextResource
				&& any.eResource().getURI() != null) {

			String fileURI = any.eResource().getURI().toPlatformString(true);
			IFile workspaceFile = ResourcesPlugin.getWorkspace().getRoot()
					.getFile(new Path(fileURI));
			if (workspaceFile != null) {
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				try {
					IEditorPart openEditor = IDE.openEditor(page,
							workspaceFile,
							"br.consiste.SysADL",
							true);
					if (openEditor instanceof AbstractTextEditor) {
						ICompositeNode node = NodeModelUtils
								.findActualNodeFor(any);
						if (node != null) {
							int offset = node.getOffset();
							int length = node.getTotalEndOffset() - offset;
							((AbstractTextEditor) openEditor).selectAndReveal(
									offset, length);
							System.out
									.println("SysADLServices.openTextEditor()");
						}
					}
					// editorInput.
				} catch (PartInitException e) {
					// Put your exception handler here if you wish to.
				}
			}
		}
		System.out.println(any);
		return any;
	}
	
	public EObject inferConnectorType(EObject port1, EObject port2) {
		return null; // TODO
	}
	
	public String nodeText(EObject exp) {
		if (exp==null) return "";
		INode expNode = NodeModelUtils.getNode(exp);
		String value = NodeModelUtils.getTokenText(expNode);
		return  value;
	}
	
	public String constraintUseText(ConstraintUse c) {
		return "<<Constraint>>\n:"+c.getDefinition().getName()+"\n"+nodeText(c.getDefinition().getEquation());
	}
}
