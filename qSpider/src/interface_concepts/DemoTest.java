package interface_concepts;

public class DemoTest {
	public static void main(String[] args) {
		System.out.println(First.a); //static variable inherited
		
		System.out.println(Demo.a); //inherited
		
		Demo d = new Demo();
		d.m1();
		
		//create the reference variable of interface
		
		First f = new Demo(); //Up-casting
		f.m1(); //method overriding --> runtime binding
		
		//default method
		d.m2();
		
		//static method
		First.m3();
		//Demo.m3(); --> error - static method is not inherited
	}

}
