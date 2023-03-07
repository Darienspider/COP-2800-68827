import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate() {
        GregorianCalendar today = new GregorianCalendar();
        this.month = today.get(Calendar.MONTH);
        this.day = today.get(Calendar.DAY_OF_MONTH);
        this.year = today.get(Calendar.YEAR);
    }

    public MyDate(long milliseconds) {
        GregorianCalendar Gcalendar = new GregorianCalendar();
        Gcalendar.setTimeInMillis(milliseconds);
        this.year = Gcalendar.get(Calendar.YEAR);
        this.month = Gcalendar.get(Calendar.MONTH);
        this.day = Gcalendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return this.year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar Gcalendar = new GregorianCalendar();
        Gcalendar.setTimeInMillis(elapsedTime);
        this.year = Gcalendar.get(Calendar.YEAR);
        this.month = Gcalendar.get(Calendar.MONTH);
        this.day = Gcalendar.get(Calendar.DAY_OF_MONTH);
    }

}