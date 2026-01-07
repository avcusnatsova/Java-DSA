package oops;

public class StaticIn {
	public static void main(String[] args) {
		System.out.println("Starting main method: ");
		int c = 50;
		System.out.println(c);
		System.out.println("Ending main method: ");
		
	}
	static {
		System.out.println("Entering into static method: ");
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		System.out.println("Exiting from static method: ");
	}

}
