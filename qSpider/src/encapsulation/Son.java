package encapsulation;

public class Son extends Father{
	String name = "Jon Snow";
	
	public void fathername() {
		System.out.println(super.name);
	}

}
