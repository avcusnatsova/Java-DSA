package oops;
import java.util.Scanner;

public class Employee {
	int id;
	String name;
	int age;
	
	public void working() {
	System.out.println("Working");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int num = sc.nextInt();
		for(int i = 0; i <= num; i ++) {
			Employee emp = new Employee();
		System.out.println("Enter the details: (ID, Name, Age)");
		
		emp.id = sc.nextInt();
		sc.nextLine();
		emp.name = sc.nextLine();
		emp.age = sc.nextInt();
		
		System.out.println("Employee ID:" + emp.id);
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee Age: " + emp.age);
		
		}
	}
}
