package encapsulation;

public class Neurologist extends Doctor{
	int brainSurgery;
	
	public Neurologist(String name, int age, char gender, int brainSurgery) {
		super(name, age, gender);
		this.brainSurgery = brainSurgery;
	}
	

}
