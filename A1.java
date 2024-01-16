/* Bailey Garrett
 * module 1 assignment 1 
 * 1/16/24 
 * CONVERSIONS BETWEEN FEET AND METERS
 *  formula 
 *   meter = 0.305 * foot
 *  foot = 3.279 * meter
 */
class A1 {
    public static void main(String[] args) {
        // print header for table
        System.out.println("Feet  Meters | Meters  Feet");
        System.out.println("------------------------------");

        // loop to do 10 iterations
        int i;
        int j = 20;
        for (i = 1; i <= 10; ++i) {
            // Convert i from feet to meters
            double meter = footToMeter(i);

            // prints the feet converted to meters
            System.out.print(i + "     " + meter + "  |  ");

            // Convert j from meters to feet
            double foot = meterToFoot(j);

            // print meter converted to feet
            System.out.println(j + "     " + foot);
            j = j + 5;

        }
    }

    // Convert i from feet to meters
    public static double footToMeter(double foot) {
        double result;
        result = 0.305 * foot;
        return result;
    }

    // Convert j from meters to feet
    public static double meterToFoot(double meter) {
        double result;
        result = meter * 3.279;
        return result;
    }

}