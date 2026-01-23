package encapsulation;

public class Student1 extends Person {
	String studentId;
	String course;
	double cgpa;
	
	public Student1 (){
		
	}
	
	public Student1(String studentId) {
		this.studentId = studentId;
	}
	
	public Student1(String studentId, String course, double cgpa) {
		this(studentId);
		this.course = course;
		this.cgpa = cgpa;
	}
	
	public Student1(String name, int age, String address, String studentId, String course, double cgpa) {
		super(name, age, address);
		
		// cannot use both super() and this() in the same first line
		
		this.studentId = studentId;
		this.course = course;
		this.cgpa = cgpa;
		
	}
	
	public void displayStudentinfo() {
		
	}

}
