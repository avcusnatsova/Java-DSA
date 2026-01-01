package loopingst;

import java.util.Scanner;

public class SmithNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(isSmith(num));
		sc.close();

	}
	public static int sumofdigits(int num) {
		int sum = 0;
		while(num != 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		return sum;
	}
	public static boolean isprime(int num) {
		int count = 0;
		int i;
		for( i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count == 2;
	}
	public static boolean isSmith(int num) {
		if (isprime(num))
			return false;
		int sumofDigits = sumofdigits(num);
		int sumofPrimefactors = 0;
		int temp = num;
		int i;
		
		for(i = 2; i <= temp; i++) {
			while(temp % i == 0) {
				if(isprime(i)) {
					sumofPrimefactors = sumofPrimefactors + sumofdigits(i);
				}
				temp = temp / i;
			}
		}
		return sumofDigits == sumofPrimefactors;
	}

}

//666
