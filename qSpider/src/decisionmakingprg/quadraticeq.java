package decisionmakingprg;

import java.util.Scanner;

public class quadraticeq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		quadeq(a,b,c);
		sc.close();
	}
	public static void quadeq(int a,int b,int c) {
		if (a == 0) {
			System.out.println("It is not a quadratic equation");
		}
		double D = b*b - 4*a*c;
		
		if (D > 0) {
			double root1 = (-b + Math.sqrt(D)) / (2*a);
			double root2 = (-b - Math.sqrt(D)) / (2*a);
			System.out.println("The roots are real and distinct, they are: " + root1 +","+ root2);
		}
		else if (D == 0) {
			double root1 = -b / (2*a);
			double root2 = root1;
			System.out.println("The roots are real and equal, they are: " + root1 + "," + root2);
		}
		else {
			double realpt = -b / (2*a);
			double imgpt = Math.sqrt(-D) / (2*a);
			System.out.println("Roots are imaginary.");
			System.out.println("root1 = " + realpt + "+" + imgpt + "i");
			System.out.println("root2 = " + realpt + "-" + imgpt + "i");
			
		}
		
	}
}
