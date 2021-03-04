package ClassPackage;

import java.util.Calendar;
import java.util.Date;

public class calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(c.YEAR);
        System.out.println(year);
        c.set(2088,10,18);
        System.out.println(c.get(c.YEAR));
        c.add(c.YEAR,-1);
        System.out.println(c.get(c.YEAR));
        Date date = c.getTime();
        System.out.println(date);
    }

}
