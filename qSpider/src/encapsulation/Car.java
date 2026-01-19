package encapsulation;

public class Car {
	String Brand; 
	String Model;
	double Price;
	Engine e; // = new Engine(); EARLY
	
	public void openDoor() {
		System.out.println("Open Door");
	}
	
	public void openBoots() {
		System.out.println("Open Boots");
	}
	
	public void start() {
		e = new Engine();
		System.out.println("Started");
	}

}
