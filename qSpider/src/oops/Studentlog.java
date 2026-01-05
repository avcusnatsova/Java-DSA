package oops;

public class Studentlog {
	String name;
	int age;
	char gender;
	long phonenum;
	String email;


	Studentlog (String name, int age, char gender, long phonenum, String email){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phonenum = phonenum;
		this.email = email;
	}
	Studentlog (String name, int age, char gender, long phonenum){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phonenum = phonenum;
	}
	Studentlog (String name, int age, char gender,  String email){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	Studentlog (String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		
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
		Studentlog s1 = new Studentlog("Eren", 20, 'M');
		Studentlog s2 = new Studentlog("Mikasa", 19, 'F', 98465806, "mikasaackerman@gmail.com");
		Studentlog s3 = new Studentlog("levi", 23, 'M', 98465809);
		Studentlog s4 = new Studentlog("Erwin", 45, 'M', "commander@incheif");
		
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
		
		
	}

}
