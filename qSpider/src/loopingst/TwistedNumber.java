package loopingst;

import java.util.Scanner;

public class TwistedNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		isPrime(num);
		int rev = reverse(num);
		System.out.println(isPrime(num) && isPrime(rev));
	}
	public static boolean isPrime(int num) {
		int count = 0;
		int i;
		for (i = 1; i <= num; i++) {
			if(num % i == 0) {
				count ++;
			}
		}
		return count == 2;
	}
	public static int reverse(int num) {
		int rev = 0;
		while(num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}

}
//97
