package loopingst;

import java.util.Scanner;

public class Swapdigitwithnextdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(reverse2(reverse1(num)));
		sc.close();
	}
	public static int reverse1(int num) {
		int rev = 0;
		while (num != 0) {
			int rem = num % 100;
			rev = rev * 100 + rem;
			num /= 100;
		}
		return rev;
	}
	public static int reverse2(int num) {
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}


}
