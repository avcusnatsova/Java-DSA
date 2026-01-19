package encapsulation;

public class Phone {
	String Brand;
	int Model;
	double Price;
	Sim s; // Lazy Instantiation
	Battery b = new Battery();  // Early Instantiation
	
	public void insertsim() {
		
		s = new Sim();
		System.out.println("Sim Inserted");
	}

}
