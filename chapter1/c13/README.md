compile multiple files at once: 

 - javac path/to/JavaFile1.java path/to/JavaFile2.java ... This will put every .class file alongside its .Java correspondant file. To run the program in this case issue: path.to.ClassNameWithMain
 - javac -d outputFolder path/to/JavaFile1.java path/to/JavaFile2.java ... This will put all .class files inside the outputFolder directory. To run the program in this case issue: java -cp outputFolder packageWithMain/ClassWithMain. Alternatively to -cp you can use -classpath or --class-path they do the same thing

if package definitions don't match with directory hierarchy the running process won't work.