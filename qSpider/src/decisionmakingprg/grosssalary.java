package decisionmakingprg;

import java.util.Scanner;

public class grosssalary {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the salary");
	int salary = sc.nextInt();
	System.out.println("Enter the years of service");
	int service = sc.nextInt();
	grosscalculation(salary, service);
	sc.close();
}
public static void grosscalculation(int salary, int service) {
	double grosssal = 0;
	if (salary <= 10000) {
		 grosssal = (0.2 * salary) + (0.8 * salary);
		System.out.println("Gross salary: " + grosssal);
	}
	else if (salary <= 20000) {
		 grosssal = (0.25 * salary) + (0.9 * salary);
		System.out.println("Gross salary: " + grosssal);
	}
	else if (salary > 20000) {
		 grosssal = (0.3 * salary) + (0.95 * salary);
		System.out.println("Gross salary: " + grosssal);
		}
	if (service >= 3) {
		grosssal += 2500;
	}
	System.out.println("The gross salary: " + grosssal);
}
}
