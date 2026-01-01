package basic_programs;

public class MathOperations {

	public static void main(String[] args) {
		System.out.println(multiply(10,5));
		System.out.println(multiply(10,5,2));
		System.out.println(multiply(2.5,5.2));
	}
	
	public static int multiply(int a ,int b) {
		return a*b;
	}
	public static int multiply(int a ,int b,int c) {
		return a*b*c;
		
	}
	public static double multiply(double a ,double b) {
		return a*b;
	}
	
	
	
}