public class MyDateTest {
    public static void main(String[] args) {
        // create polygons
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);
        MyDate date3 = new MyDate(561555550000L);

        // print results with method
        displayInfo(date1);
        displayInfo(date2);
        displayInfo(date3);
    }

    // method to print results
    private static void displayInfo(MyDate date) {
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println();
    }
}