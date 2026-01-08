package package1;

public class demo1 {
	public int b = 10;
	public static int a = 10;
	
	public void method1() {
		System.out.println("Non static method of package 1.");
	}
	
	public static void method2() {
		System.out.println("Static method of package 1.");
		
	}
	
	//public constructor
	public demo1() {
		System.out.println("Constructor executed");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Static method of package 1.");
		demo1 d1 = new demo1();
		System.out.println("From package 1" + demo1.a);
		d1.method1();
		method2();
	}

}
