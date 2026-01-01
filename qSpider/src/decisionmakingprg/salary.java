package decisionmakingprg;

import java.util.Scanner;

public class salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the gender:");
		char gen = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter qualification:");
		String qualif = sc.nextLine();
		System.out.println("Enter years of service");
		int service = sc.nextInt();
		calc(gen, qualif, service);
		sc.close();
	}
	public static void calc(char gen, String qualif, int service) {
		int salary = 0;
		if (gen == 'M' && service >= 10 && qualif.equals("Post graduate")) {
			salary = 15000;
		}
		else if (gen == 'M' && service >= 10 && qualif.equals("Graduate")) {
			salary = 10000;
		}
		else if (gen == 'M' && service < 10 && qualif.equals("Post graduate")) {
			salary = 10000;
		}
		else if (gen == 'M' && service < 10 && qualif.equals("Graduate")) {
			salary = 7000;
		}
		else if (gen == 'F' && service >= 10 && qualif.equals("Post graduate")) {
			salary = 12000;
	}
		else if (gen == 'F' && service >= 10 && qualif.equals("Graduate")) {
			salary = 9000;
		}
		else if (gen == 'F' && service < 10 && qualif.equals("Post graduate")) {
			salary = 8000;
}
		System.out.println("Salary: " + salary);
	}
}
