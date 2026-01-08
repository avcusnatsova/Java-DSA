package package2;
import package1.demo1;

public class demo2 {
	public static void main(String[] args) {
		System.out.println(demo1.a);
		demo1 d2 = new demo1();
		
		System.out.println("From package 2: " + d2.b);
		System.out.println("From package 2: " + demo1.a);
		
		d2.method1();
		demo1.method2();
		
		
	}

}
