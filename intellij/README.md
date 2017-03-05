# ex-paninij-intellij-setup

The contents of this folder demonstrate how to configure a simple @PaniniJ
project which can be built with and developed with IntelliJ IDEA.

Within the IDE, we will create a new IntelliJ project and enable the @PaniniJ
compiler plugin. The configuration described below may seem complicated, but
it is standard if you want to use a Java annotation processor within IntelliJ.

1. Select "File" > "New" > "Project from Existing Sources"

2. Browse to and select this folder, then click "Open".

3. Select "Create project from existing sources".

4. Then proceed through the "Import Project" wizard by selecting "Next" a number
   of times. Then close the wizard by clicking "Finish".

5. Next open "Preferences" > "Build, Execution, Deployment" > "Compiler" >
   "Annotation Processors".
    - Toggle "Enable annotation processing"
    - Make sure that "Obtain processors from project classpath" is selected.
    - Note where generated sources will be placed. By default, generated
      sources are placed relative to the "Module output directory", i.e. `out/`.
      For me, sources are placed in `out/production/intellij/generated`.
    - Exit this menu and "Build Project" once so that this generated sources
      directory will be created.

6. Now Open "Project Structure" > "Modules" > "Dependencies". Make
   sure that the `libs` directory (which holds the @PaniniJ JARs) is listed
   here.

7. Within "Project Structure" > "Modules" > "Sources", browse to the
   generated sources directory which we noted above and mark it as "Sources"
   (that is, select the `generated/` folder and then click the blue folder).

Now whenever you "Build Project", the @PaniniJ compiler plugin will be run as
well. This will perform additional @PaniniJ syntax checks on your capsule
declarations and generate additional @PaniniJ sources from them.
