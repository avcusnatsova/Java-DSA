package oops;

public class ClassLoading {
	//non static variable
	int a;
	//non static initializer
	int b = 10;
	//static variable
	static int x;
	//static initializer
	static int y = 20;
	
	//constructor
	ClassLoading(int a){
		this.a = a;
	}
	
	//non static multi-line initializer
	{
		System.out.println("non static multi-line initializer");
	}
	
	//static multi-line initializer
	static {
		System.out.println("static multi-line initializer");
	}
	
	

}
