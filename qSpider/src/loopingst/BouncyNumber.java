package loopingst;

import java.util.Scanner;

public class BouncyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(!isIncreasing(num) && !isDecreasing(num) ? "It is Bouncy number" : "It is not a bouncy Number");
		sc.close();
	}
	public static boolean isIncreasing(int num) {
		int temp = 10;
		while(num != 0) {
			int digit = num % 10;
			if(digit <= temp) {
				temp = digit;
			}
			else {
				return false;
			}
			num /= 10;
		}
		return true;
	}
	
	public static boolean isDecreasing(int num) {
		int temp = -1;
		while(num != 0) {
			int digit = num % 10;
			if(digit >= temp) {
				temp = digit;
			}
			else {
				return false;
			}
			num /= 10;
		}
		return true;
	}

}
