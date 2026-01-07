package oops;

public class Studentcl {
	int rollno;
	String name;
	int age;
	double java;
	double sql;
	double webtech;
	
	//Static variable
	static String collegename;
	
	static int count;
	
	Studentcl(int rollno, String name, int age, double java, double sql, double webtech){
		System.out.println(this.rollno = rollno);
		System.out.println(this.name = name);
		System.out.println(this.age = age);
		System.out.println(this.java = java);
		System.out.println(this.sql = sql);
		System.out.println(this.webtech = webtech);
		count++;
	}
	
	public double percal() {
		double per;
		per = ((java+sql+webtech)/300) * 100;
		return per;
	}
	
	public static void timing() {
		System.out.println("Student Timing: ");
		System.out.println("Class Timing: 8:00 am - 3:15 pm");
		System.out.println("Lunch Timing: 11:30 am - 12:15 pm");
	}
	
	public static void policy() {
		System.out.println("Student Policy: ");
		System.out.println("ID mandatory.");
		System.out.println("No interaction between boys and girls.");
		System.out.println("No outside food allowed");
	}
	
	public static void main(String[] args) {
		Studentcl s1 = new Studentcl(101, "Steve", 20, 70, 80,90);
		System.out.println("Percentage: " + s1.percal());
		s1.timing();
		s1.policy();
		
		s1.collegename = "Panimalar";
		System.out.println("College of student: " + s1.collegename);
		s1.collegename = "Rajalakshmi";
		System.out.println("College of student: " + s1.collegename);
		System.out.println("Number of objects in class: " + Studentcl.count);
	}

}
