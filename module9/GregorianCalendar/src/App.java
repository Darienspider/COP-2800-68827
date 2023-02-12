import java.util.*;

        /*9.5  (Use the GregorianCalendar class) Java API has the GregorianCalendar 
        class in the java.util 
        package, which you can use to obtain the year, month, and day of a date.  
        The no-arg constructor constructs an instance for the
        current date, and the methods get(GregorianCalendar.YEAR),
        get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH)
        return the year, month, and day.

Technical Specifications

Display the current year, month, and day.
The GregorianCalendar class has the setTimeInMillis(long), 
which can be used to set a specified elapsed
 time since January 1, 1970.
Set the value to 1234567898765L and display the year, month, and day.
     */

public class App {


    public static void main(String[] args) throws Exception {
        GregorianCalendar calendar = new GregorianCalendar();
        Calendar.getInstance();
        System.out.println("Current Time: " + calendar.get(GregorianCalendar.YEAR) + " " +  (calendar.get(GregorianCalendar.MONTH)+1) + " "  + calendar.get(GregorianCalendar.DAY_OF_MONTH));
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("New Time: " + calendar.get(GregorianCalendar.YEAR) + " " +  (calendar.get(GregorianCalendar.MONTH)+1) + " "  + calendar.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
