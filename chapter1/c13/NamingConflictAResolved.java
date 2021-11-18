/* 
    Explicitly import a class takes predence over any 
    wildcard.
*/
import java.util.*;
import java.sql.Date;

public class NamingConflictAResolved {
    // In this example we are assuming that the actual implementation that
    // we want is the one into the java.sql package
    private Date date;
}
