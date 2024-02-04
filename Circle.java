/* Bailey Garrett
 * module 3 assignment 1 
 * 2/3/24 
 * ENABLE CIRCLE COMPARABLE
 */
public class Circle extends GeometricObject implements Comparable<Circle> {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,
            String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** compare radii to check equality */

    @override
    public int compareTo(Circle otherCircle) {
        if (this.radius < otherCircle.radius) {
            return -1;
        } else if (this.radius > otherCircle.radius) {
            return 1;
        } else {
            return 0;
        }
    } 

    //override equals to check for equal radii
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle)
            return radius == ((Circle)o).radius;
        else
            return false;
    }
}