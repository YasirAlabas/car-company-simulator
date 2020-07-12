package login;
import java.util.Date;

/**
 * Created by AbdulRahman on 12/10/2017.
 */
public class Employee extends User {
        private int salary;
    public Employee(String fn, String ln, String u, String e, String a, String p, Date d, int s) {
       super(fn,ln,u,e,a,p,d);
       salary = s;
    }

}
