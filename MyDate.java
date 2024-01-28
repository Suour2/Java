/* Bailey Garrett
 * module 2 assignment 2 
 * 1/27/24 
 * mydate
 */

import java.util.GregorianCalendar;

public class MyDate {
    private long year;
    private long month;
    private long day;

    // no-arg for current date
    public MyDate() {
        this(System.currentTimeMillis());
    }

    // constructor with elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // constructoe with specific date
    public MyDate(long year, long month, long day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // getter method
    public long getYear() {
        return year;
    }

    // getter method
    public long getMonth() {
        return month;
    }

    // getter method
    public long getDay() {
        return day;
    }

    // method to 'setter' date
    public void setDate(long elapsedTime) {
        // create gregorian calendar object and set the time
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);

        // set date with calendar
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}