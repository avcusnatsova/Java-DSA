package decisionmakingprg;

import java.util.Scanner;

public class marksgrades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks for the following");
		System.out.println("Physics:");
		double phy = sc.nextDouble();
		System.out.println("Chemistry:");
		double chem = sc.nextDouble();
		System.out.println("Biology:");
		double bio = sc.nextDouble();
		System.out.println("Maths:");
		double math = sc.nextDouble();
		System.out.println("Computer:");
		double com = sc.nextDouble();
		grades(phy,chem,bio,math,com);
		sc.close();
	}
	public static void grades(double phy, double chem, double bio, double math, double com) {
		double total = phy + chem + bio + math + com;
		double percent = (total / 500) * 100;
		System.out.println("Percentage: " + percent);
		if (percent >= 90) {
			System.out.println("Grade A");
		}
		else if (percent >= 80) {
			System.out.println("Grade B");
		}
		else if (percent >= 70) {
			System.out.println("Grade C");
		}
		else if (percent >= 60) {
			System.out.println("Grade D");
		}
		else if (percent >= 40) {
			System.out.println("Grade E");
		}
		else if (percent < 40 ){
			System.out.println("Grade F");
		}
				
	}

}
