package encapsulation;

public class Human {
	String Name;
	int Age;
	String Gender;
	Heart h = new Heart(); //EARLY
	Shoes s; //LAZY
	
	public void wearshoes() {
		s = new Shoes();
		System.out.println("Wearing shoes");
	}

}
