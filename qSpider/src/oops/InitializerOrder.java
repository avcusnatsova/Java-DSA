package oops;

public class InitializerOrder {
	
	//Single line Non-Static Initializer
	int a = 1;
	
	//Multi-Line Non-Static Initializer
	{
		System.out.println("Value before entering into first multi-line initializer: " + a);
		a = 2;
		System.out.println("Value after entering into first multi-line initializer:" + a);
	}
	
	
	//Constructor
	public InitializerOrder(int a) 
	{
		System.out.println("Value before entering into constructor: " + a);
		this.a = a;
		System.out.println("Value after entering into constructor: " + a);
	}
	
	//Multi-Line Non-Static Initializer
	{
		System.out.println("Value before entering into second multi-line initializer: " + a);
		a = 3;
		System.out.println("Value after entering into second multi-line initializer:" + a);
	}
	
	//main
	public static void main(String[] args) {
		
		InitializerOrder obj = new InitializerOrder(4);
		System.out.println("Value after entering into main: " + obj.a);
		
		obj.a = 5;
		
		System.out.println("Final Value at a: " + obj.a);
		
	}

}
