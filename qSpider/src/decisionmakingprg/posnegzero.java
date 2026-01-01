package decisionmakingprg;

import java.util.Scanner;

public class posnegzero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		numcheck(num);
		sc.close();
	}
	public static void numcheck(int num) {
		if (num < 0) {
			System.out.println("The number is negative");
		}
		else if (num > 0) {
			System.out.println("The number is positive");
	    }
		else if (num == 0) {
			System.out.println("The number is zero");
        }
}
}

