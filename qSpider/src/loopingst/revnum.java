package loopingst;

import java.util.Scanner;

public class revnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		reverse(num);
		sc.close();
		
	}
	public static void reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println(rev);
	}

}
