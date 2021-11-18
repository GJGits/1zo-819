import java.util.Date;
import java.sql.Date;

/* 
    Let's say that we want the sql version as a field and
    the util version for the method.
*/

public class NamingConflictBResolved {
    private java.sql.Date date;
    public java.util.Date convertDate() {return new java.util.Date(this.date.getTime());}
}
