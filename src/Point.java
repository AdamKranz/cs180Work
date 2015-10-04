
/**
 * Question 4 
 *
 *      Note 1: The PointTest.java file within this module has compile time errors.
 * 		This is because the Point class is incomplete. If you complete the Point
 * 		class correctly, all the compile time errors within PointTest will
 * 		automatically get fixed.
 *
 * 		- The class Point defined below can be used to manipulate an (x,y)
 * 		pair in programs involving the Cartesian coordinate system. 
 *
 * 		- Within the Point class, create one constructor that allows the user
 * 		to specify values for x and y and a default constructor that takes 
 * 		no arguments and sets both x and y to 0. Create accessors and mutators 
 * 		for x and y. The accessor and mutator for x should be named getX and 
 * 		setX, respectively. Similarly for y.
 *
 * 		- Create a method with the header public double distance(Point p) that 
 * 		uses the distance formula to find the distance between the current 
 * 		Point object and the Point object p passed in as an argument.
 *
 * 		Note 2: distance between two points (x1, y1) and (x2, y2) is given by
 * 		the formula:
 * 			square root of [(x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)]
 *
 */
public class Point {
    private int x; // do not edit this statement
    private int y; // do not edit this statement
    public Point(int x, int y) {
        this.y = y;
        this.x = x;
    }
    public Point() {
        this(0,0);
    }
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(Point p) {
        return Math.sqrt(((-this.x+p.getX())*(-this.x+p.getX())+(-this.y+p.getY())*(-this.y+p.getY())));
    }
}
