package interface_concepts;

public interface First {
	// CAN CREATE 6 THINGS INSIDE INF
	
	// BEFORE JAVA VER 8
	
	int a = 10;
	//1. by default complier converts variables into "public static final"
	// if a variable is final --> can't change value
	// if method is final --> can't change implementation
	
	void m1();
	//2. by default any method is "public abstract and non static"
	
	// AFTER JAVA VER 8
	
	
	// 3. default method --> has common implementation        (contradicts 2.)
	// default --> keyword
	
	default void m2() {  //public default void m2()
		System.out.println("Default method of first.");
	}
	// visibility of default is public | it is not a access modifier
	
	// 3.1 you can create static methods
	static void m3() {
		System.out.println("Static method of first");
	}
	
	// 4. static methods will not be inherited
	
	// 5. in JAVA VER 9   private --> helper
	// 6. private static + private non-static
	
	private static void m4() {
		System.out.println("private static");
	}
	
	private void m5() {
		System.out.println("private non static");
	}

}
