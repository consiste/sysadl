
# Important

Never commit to the master branch, it might lead to several issues. Create your own branch and work on it. As soon as you finish your work, create a pull request to the master branch.

# Requirements 

- Eclipse Xcore - Update site: https://download.eclipse.org/modeling/emf/emf/updates/releases/
- Kermetta3 - Update site: http://www.kermeta.org/k3/update/
- Xtext - Update site: http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/
- Sirius - Update site: http://download.eclipse.org/sirius/updates/releases/6.2.0/photon

# SysADL

In order to start working with this code, follow these steps:
- Clone the repository
- Import as existing projects in Eclipse (there will be a lot of errors)
- Reload and open org.sysadl/model/SysADL.genmodel
- Right click in the main object, select Generate All
- Open org.sysadl.editor/org.sysadl.presentation
- Right click on SysADLModelWizard.java, select Restore From Local History. 
-- If nothing happens, clone this file again from this repository
- Run org.sysadl.grammar/br/consiste/GenerateLanguage.mw2
- Clean and build workspace

Report any problem you find with this process.

# How to use SysADL Studio

After following the steps above, you can already run the tool.
For doing so, go Run > Run Configurations. Select Eclipse Application, click new, click apply and run.
