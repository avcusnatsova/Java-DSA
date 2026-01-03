package oops;

public class Student {
	public Student() {
		System.out.println("Student Object created");
	}
	public static void main(String[] args) {
		//creating object with ref
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		//creating object without ref
		new Student();
		new Student();
		new Student();
	}

}
