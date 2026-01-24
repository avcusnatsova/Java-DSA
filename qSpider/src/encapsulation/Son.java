package encapsulation;

public class Son extends Father{
	String name = "Jon Snow";
	
	public void fatherName() {
		System.out.println(super.name);
	}

}
