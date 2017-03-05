# `ex-paninij-eclipse-setup`

To use the sources and JARs in this directory as an Eclipse project:

1.  Create a new Eclipse project rooted in this directory.
2.  Open "Project" > "Properties" > "Java Compiler" > "Annotation Processing".
3.  Select "Enable annotation processing."
4.  *Optional:* Change the "Generated source directory". (E.g. Make it
    non-hidden by removing the `.` prefix.)
5.  Open "Factory Path".
6.  Select "Add JARs..."
7.  Browse to `libs/` and select *both* JARs (i.e. `proc` & `lang`).
