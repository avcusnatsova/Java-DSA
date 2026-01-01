package loopingst;

import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		isHarshadnum(num);
		System.out.println(isHarshadnum(num) ? "It is a harshad number" : "It is not a harshad number" );
		sc.close();
	}
	public static boolean isHarshadnum(int num) {
		int sum = 0;
		int temp = num;
		while( temp != 0) {
			int digit = temp % 10;
			sum += digit;
			temp /= 10;
		}
		return num % sum == 0;
		}
}

//18
