package loopingst;

import java.util.Scanner;

public class primenum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(findfactors(num) ? "prime" : "not prime");
		sc.close();
	}
	public static boolean findfactors(int num) {
		int count = 0;
		int i;
		for( i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

}
