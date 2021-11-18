package packageb;

import packagea.ClassA;

/* 
    Compile but it does not work, this class is not into 
    packageb/ClassB.java file. 
*/

public class ClassB {
    public static void main(String[] args) {
        System.out.println(ClassA.getMessage());
    }
}