package oops;

public class GrossSal {
	int id = (int)(Math.random()*1000);
	String companyname = "TATA";
	String name;
	int age;
	double basicsal;
	
	void display() {
		System.out.println("Empolyee Details: ");
		System.out.println();
		System.out.println("Employee Name: " + name);
		System.out.println("Company Name: " + companyname);
		System.out.println("Employee ID: " + id);
		System.out.println("Empolyee Age: " + age);
		System.out.println("Employee Basic Salary: " +basicsal);
		
	}
	public void grosssalcal() {
		double grossSal = (basicsal + ((20.0/100) * basicsal + (40.0/100) * basicsal ));
		System.out.println("Gross Salary: " + grossSal);
		
	}
	GrossSal(String name, int age, double basicsal){
		this.name = name;
		this.age = age;
		this.basicsal = basicsal;
	}
	
	public static void main(String[] args) {
		GrossSal g1 = new GrossSal("Cusnat", 23, 10000);
		g1.display();
		g1.grosssalcal();
	}

}
