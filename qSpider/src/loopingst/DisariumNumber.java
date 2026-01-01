package loopingst;

import java.util.Scanner;

public class DisariumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(isDisarium(num));
		sc.close();
	}
	public static int powerOf(int base, int expo) {
		int res = 1;
		for(int i = 1; i <= expo; i++) {
			res = res * base;
		}
		return res;
	}
	
	public static int countDigits(int num) {
		int digits = 0;
		while(num != 0) {
			digits ++;
			num = num / 10;
		}
		return digits;
	}
	public static boolean isDisarium(int num) {
		int temp = num;
		int sum = 0;
		
		int position = countDigits(num);
		
		while(num != 0) {
			int rem = num % 10;
			sum = sum + powerOf(rem, position);
			position--;
			num = num / 10;
		}
		return sum == temp;
	}

}
