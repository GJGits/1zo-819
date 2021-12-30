package packageb;
import packagea.*;

public class SupportClass2 {
    Snippet211 snippet;
    public SupportClass2() {
        this.snippet = new Snippet211();
        // this line does not compile because the
        // variable 'a' has a package visibility
        // and we are trying to access from an
        // another package
        //int a = this.snippet.a;
    }    
}
