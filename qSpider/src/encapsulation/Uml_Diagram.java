package encapsulation;

public class Uml_Diagram {
	String studentId;
	String name;
	int age;
	private double gpa;
	String major;
	boolean isEnrolled;
	
	Uml_Diagram( String name, int age, String major){
		this.name = name;
		this.age = age;
		this.major =  major;
	}
	public String getstudentId() {
		return studentId;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public double getgpa() {
		return gpa;
	}
	
	public String getmajor() {
		return major;
	}
	public boolean isEnrolled() {
		return isEnrolled;
	}
	

}
