package decisionmakingprg;

import java.util.Scanner;

public class upperlower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		casecheck(ch);
		sc.close();
	}
	public static void casecheck(char ch) {
		if (ch>= 60 && ch<=98) {
			System.out.println("Uppercase");
		}
		else if (ch >= 97 && ch <= 122) {
			System.out.println("Lowercase");
		}
	}
}
