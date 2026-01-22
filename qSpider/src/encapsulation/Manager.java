package encapsulation;

public class Manager {
	private String name;
	private int age;
	
	Manager(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

}
