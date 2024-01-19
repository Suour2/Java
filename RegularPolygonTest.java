public class RegularPolygonTest {
    public static void main(String[] args) {
        // create polygons
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        //print results with method
        displayInfo(polygon1);
        displayInfo(polygon2);
        displayInfo(polygon3);
    }
        //method to print results 
    private static void displayInfo(RegularPolygon polygon) {
        System.out.println("Perimeter: " + polygon.getPerimeter());
        System.out.println("Area: " + polygon.getArea());
        System.out.println();
    }
}
