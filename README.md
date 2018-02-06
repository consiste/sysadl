
# Important

Never commit to the master branch, it might lead to several issues. Create your own branch and work on it. As soon as you finish your work, create a pull request to the master branch.

# SysADL

In order to start working with this code, follow these steps:
- Clone the repository
- Import as existing projects in Eclipse (there will be a lot of errors)
- Open SysADL_Sintax/model/SysADL_Sintax.genmodel
- Right click in the main object, select Generate All
- Open SysADL_Sintax.editor/sysADL_Sintax.presentation
- Right click on SysADLModelWizard.java, select Restore From Local History. 
-- If nothing happens, clone this file again from this repository
- Clean and build workspace
- Run SysADL_Sintax.grammar/br/consiste/GenerateSysADL.mw2
- Clean and Build workspace again

Report any problem you find with this process.

IMPORTANT: Sirius uses Java frames which sources are NOT included in common JREs. Therefore, install JDK and configure Eclipse to use it to build instead of any JRE.
