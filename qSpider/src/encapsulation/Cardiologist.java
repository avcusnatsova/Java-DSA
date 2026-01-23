package encapsulation;

public class Cardiologist extends Doctor {
	int ecgPermonth;
	int heartSurgery;
	
	public Cardiologist(String name, int age, char gender, int ecgPermonth, int heartSurgery) {
		super(name, age, gender);
		this.ecgPermonth = ecgPermonth;
		this.heartSurgery = heartSurgery;
	}

}
