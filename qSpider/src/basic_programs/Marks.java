package basic_programs;

public class Marks {
public static void main(String[] args) {
	int mark1=85,mark2=30,mark3=35;
	String Stud1=mark1>=35? "Student1 pass " +mark1 :"fail";
	String Stud2=mark2>=35? "Student2 pass " +mark2 :"student2 fail";
	String Stud3=mark3>=35? "Student3 pass " +mark3 :"fail";

System.out.println(Stud1);
System.out.println(Stud2);
System.out.println(Stud3);
}
}