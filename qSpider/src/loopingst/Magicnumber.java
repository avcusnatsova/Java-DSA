package loopingst;

import java.util.Scanner;

public class Magicnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(magicNumber(num));
		sc.close();
	}
	public static boolean magicNumber(int num) {
		while(num > 9) 
		{
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		num = sum;
		}
       return num == 1;
	}

}
