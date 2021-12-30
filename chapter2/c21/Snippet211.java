package packagea;

public class Snippet211 {

   /**
    * - instance variable of this class: every object instance of this class will have an indipendent variable called in this way
    * - package visibility: this variable can be accessed directly from any other class that belongs to this package
    * - primitive type: this variable holds a value
    * - default value: 0
   */
    int a;
    /**
    * - instance variable of this class: every object instance of this class will have an indipendent variable called in this way
    * - private visibility: this variable can be accessed directly only from within this class
    * - object: this variable holds a reference
    * - default value: null
   */
    private String b;
    /**
    * - instance variable of this class: every object instance of this class will have an indipendent variable called in this way
    * - public visibility: this variable can be directly accessible from all the classes in the code
    * - primitive type: this variable holds a value
    * - default value: 0.0
   */
    public double c;
    /**
    * - class variable of this class: every object instance of this class will share the same variable
    * - public visibility: this variable can be directly accessible from all the classes in the code
    * - primitive type: this variable holds a value
    * - default value: '\u0000'
   */
    public static char D;

    public static void main(String[] args) {
        SupportClass supportClass = new SupportClass();
        // it is also possible to access the variable 'b' in this situation,
        // enen though the variable is private and we are trying to access it
        // through another class (SupportClass) the variable 'b' still belongs
        // to this class.
        String b = supportClass.snippet.b;
    }
    
}

class SupportClass {
    
    public Snippet211 snippet;
    
    public SupportClass() {
        
        this.snippet = new Snippet211();
        
        // it is possible to access the variable called 'a' 
        // because it has a package visibility and SupportClass 
        // is in the same package
        this.snippet.a = 2;
        
        // it is not possible to access the variable called 'b' 
        // because it has a private visibility.
        // this.snippet.b = "hello";

        // it is possible to access the variable called 'c' 
        // because it has a public visibility.
        this.snippet.c = 3.5;
    }
}
