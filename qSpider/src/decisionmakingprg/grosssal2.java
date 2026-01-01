package decisionmakingprg;

import java.util.Scanner;

public class grosssal2 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the salary");
	int salary = sc.nextInt();
	grosscalculation(salary);
	sc.close();
}
public static void grosscalculation(int salary) {
	double grosssal = 0;
	if (salary < 1500) {
		 grosssal = (0.1 * salary) + (0.9 * salary);
		System.out.println("Gross salary: " + grosssal);
	}
	else if (salary >= 1500) {
		 grosssal = 500 + (0.98 * salary);
		System.out.println("Gross salary: " + grosssal);
	}
}
}