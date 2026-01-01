
package basic_programs;

public class AreaCalculator {

	public static void main(String[] args) {
		System.out.println("The area of square is: "+area(4));
		System.out.println("The area of rectangle is: "+area(11.5,12.0));
		System.out.println("The area of squre is: "+area(12.2));
	}
	
	public static int area(int side) {

		return side*side;
	
	}
	
	public static double area(double length,double breadth) {
		return length*breadth;
	}
	
	public static double area(double radius) {
		return 3.14*radius*radius;
	}
	
	
}