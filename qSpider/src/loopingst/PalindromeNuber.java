package loopingst;

import java.util.Scanner;

public class PalindromeNuber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		isPlaindrome(num);
		System.out.println(isPlaindrome(num));

	}
	public static boolean isPlaindrome(int num) {
		int temp = num;
		int rev = 0;
		while(num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		return temp == rev;
	}

}
