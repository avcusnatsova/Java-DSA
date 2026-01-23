package encapsulation;

public class Person {
	String name;
	int age;
	String address;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age, String address) {
		this(name); //this call statement;
		this.age = age;
		this.address = address;
	}
	
	public void displayPersoninfo() {
		
	}

}
