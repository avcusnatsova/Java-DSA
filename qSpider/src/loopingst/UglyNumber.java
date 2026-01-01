package loopingst;

import java.util.Scanner;

public class UglyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		divby235(num);
		System.out.println(divby235(num)? "It is a ugly number" : "It is not a ugly number");
		sc.close();
	}
	public static boolean divby235 (int num) {
		while(num % 2 == 0) {
			num /= 2;
		}
		while(num % 3 == 0) {
			num /= 3;
		}
		while(num % 5 == 0) {
			num /= 5;
		}
		if(num == 1)
			return true;
	    return false;
}
	
}
//6 & 14
