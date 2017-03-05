# `ex-paninij-gradle-intellij-setup`

The contents of this folder demonstrate how to configure a simple @PaniniJ
project which can be built with Gradle and developed within IntelliJ IDEA.

To import this Gradle project IntelliJ:

- Select "Import" to start the Import Wizard Dialog
- Select "Import project from external model" > "Gradle"
- Click "Next" and then "Finish" to complete the Import Wizard Dialog
- Select "Preferences" > "Build, Execution, Deployment" > "Build Tools" >
  "Gradle".
- Enable "Delegate IDE build/run actions to gradle"

These are directions as of IntelliJ IDEA v2016.3. Unfortunately, with this
version of IntelliJ, one of @PaniniJ's most useful features doesn't work within
the IDE: the IDE does not display @PaniniJ compile error messages. (That is,
there are no red squigglies when a capsule declaration violates some @PaniniJ
syntax rule.)

However, these checks *will* be reported when the project is built with Gradle
from the command line.
