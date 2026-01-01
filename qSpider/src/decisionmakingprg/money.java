package decisionmakingprg;

import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount = sc.nextInt();
		countmoney(amount);
		sc.close();
	}
	public static void countmoney(int amount) {
		if (amount >= 500) {
			int n= amount / 500;
			System.out.println("500: " + n);
			amount %= 500;
		}
		if (amount >= 200) {
			int n = amount/200;
			System.out.println("200: " + n);
			amount %= 200;
		}
		else if (amount >= 100) {
			int n = amount / 100;
			System.out.println("100: " + n);
			amount %= 100;
		}
		if (amount >= 50) {
			int n = amount / 50;
			System.out.println("50: " + n);
			amount %= 50;
		}
		else if (amount >= 20) {
			int n = amount / 20;
			System.out.println("20: " + n);
			amount %= 20;
		}
		if (amount >= 10) {
			int n = amount / 10;
			System.out.println("10: " + n);
			amount %= 10;
		}
		else if (amount >= 5) {
			int n = amount / 5;
			System.out.println("5: " + n);
			amount %= 5;
		}
		if (amount >= 2) {
			int n = amount / 2;
			System.out.println("2: " + n);
			amount %= 2;
		}
		if (amount >= 1) {
			int n = amount / 1;
			System.out.println("1: " + n);
			//amount %= 1;
		}
	}
}
