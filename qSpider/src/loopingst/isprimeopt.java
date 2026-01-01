package loopingst;

import java.util.Scanner;

public class isprimeopt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		isprime(num);
		System.out.println(isprime(num) ? "Prime" : " Not prime");
	}
	public static boolean isprime(int num) {
		for(int i = 2; i <= num/2; i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}

}
