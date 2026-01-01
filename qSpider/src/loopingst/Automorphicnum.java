package loopingst;

import java.util.Scanner;

public class Automorphicnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		automorphicNumber(num);
		System.out.println(automorphicNumber(num) ? "It is automorphic" : "It is not automorphic" );
		
	}
	public static boolean automorphicNumber(int num) {
		int count = countdigits(num);
		int square = num*num;
		int power = poweroff(10, count);
		return square%power == num;
	}
	public static int countdigits(int num) {
		int count = 0;
		while(num != 0) {
			count ++;
			num /= 10;
		}
		return count;
	}
	public static int poweroff(int base, int expo) {
		int res = 1;
		for(int i = 1; i<=expo; i++) {
			res *= base;
		}
		return res;
		
	}

}
//76&25