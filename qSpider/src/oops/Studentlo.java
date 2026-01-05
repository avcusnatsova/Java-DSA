package oops;

public class Studentlo {
	String name;
	int age;
	char gender;
	long phonenum;
	String email;
	
	Studentlo (String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	Studentlo (String name, int age, char gender,  String email){
		this(name, age, gender);
		this.email = email;

}
	Studentlo (String name, int age, char gender, long phonenum){
		this(name, age, gender);
		this.phonenum = phonenum;
	
}
	Studentlo (String name, int age, char gender, long phonenum, String email){
		this(name, age, gender);
		this.phonenum = phonenum;
		this.email = email;
}
	void display() {
		System.out.println("Login Details: ");
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phonenum);
		System.out.println();
}
	public static void main(String[] args) {
		Studentlo s1 = new Studentlo("Eren", 20, 'M');
		Studentlo s2 = new Studentlo("Mikasa", 19, 'F', 98465806, "mikasaackerman@gmail.com");
		Studentlo s3 = new Studentlo("levi", 23, 'M', 98465809);
		Studentlo s4 = new Studentlo("Erwin", 45, 'M', "commander@incheif");
		
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
		
		
	}

}
