The directory src contains a simple Main class with a main method in it.

- 1 Compile file: to do so either run  `javac src/Main.java` or more conveniently `javac -d classes src/Main.java`. This second command will put the compiled file into the `classes` folder. In both cases the code structure will be preserved (i.e there will be a `src` directory containing the `Main.class` file).

- 2 Put the compiled sources into a jar file: issue the command  `jar cvmf META-INF/MANIFEST.MF myJarFile.jar -C classes src`. This command will create a jar file inside the current directory. Let's break down this command:

 - `jar` is executable to create a JAR archive.
 - `c` is the option to create a JAR
 - `v` is to select a verbose output, this is optional 
 - `m` is to include an extension of the manifest. The `jar` command will create an empty Manifest by default, with this option we can provide our manifest. Keep in mind that the two manifest will be merged and that the provided manifest must end with a new line.
 - `f` is the file argument, this is needed to tell to the jar command to create a file otherwise the output would be the standard output. Remember that the `m` and `f` options can appear in each order but the values provided must appear in the same order of the `m` and `f` parameters.
 - `C` this option as stated in the [java documentation](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/jar.html) *Temporarily changes directories to dir while processing the following inputfiles argument. Multiple -C dir inputfiles sets are allowed.*. In our case the parameter change the directory to `classes` and include the content of the `src` directory. Trying to select as input file `classes/src*` would lead to include also `classes` into the JAR.

 For other details on the `jar` command please refer to the [jar synopsis guide](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/jar.html).

- 3 Run the program from a JAR: issue the command `java -jar myJarFile.jar`.