package loopingst;

import java.util.Scanner;

public class CircularPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(isCircularPrime(num));
		sc.close();
	}
	public static int countdigits(int num) {
		int count = 0;
		while(num != 0) {
			count ++;
			num = num / 10;
		}
		return count;
	}
	public static int powerof(int base, int expo) {
		int res = 1;
		for(int i = 1; i <= expo; i++) {
			res = res * base;
		}
		return res;
	}
	public static boolean isPrime(int num) {
		int count = 0;
		for(int i = 1; i <= num ; i++) {
			if(num % i == 0) {
				count ++;
			}
		}
		return count == 2;
	}
	public static boolean isCircularPrime(int num) {
		if(!isPrime(num)) {
			return false;
		}
		int digits = countdigits(num);
		int power = powerof(10, digits - 1);
		
		int rotated = num;
		
		for( int i = 1; i <= digits; i++) {
			int last = rotated % 10;
			int remaining = rotated / 10;
			
			rotated = last *  power + remaining;
			
			if(!isPrime(rotated)) {
				return false;
			}
		}
		return true;
	}

}
