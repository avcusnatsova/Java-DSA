package inheritance;

public class C {
	static {
		System.out.println("Static initializer of C");
	}
	int a = 10;
	
	public C()
	{
		
	}
	
	public C(int a) {
		this.a = a;
	}
	public void m1() {
		System.out.println("Static method of C");
	}

}
