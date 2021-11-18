/* 
    Let's say that we are in a scenario where we need
    both. 
*/

import java.util.Date;
import java.sql.Date;

public class NamingConflictB {
    // Which one ??
    private Date date;
    // What about this one ??
    public Date newDate() {return new Date();}

}
