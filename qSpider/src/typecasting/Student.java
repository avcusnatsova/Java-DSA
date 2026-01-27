package typecasting;

public class Student extends Person {
	int yearOfPassout;
	String degree;
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.yearOfPassout);
		System.out.println(s.degree);
		
	Person p = new Student(); //UPCASTING
//		//System.out.println(p.degree);  CANT ACCESS CHILD CLASS MEMBERS
//		System.out.println(p.name);
		
		Student s1 = (Student)p;
		System.out.println(s1.name);
		System.out.println(s.yearOfPassout);
		
	}

}
