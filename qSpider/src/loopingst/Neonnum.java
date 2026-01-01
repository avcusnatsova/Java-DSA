package loopingst;

import java.util.Scanner;

public class Neonnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		neonnum(num);
		System.out.println(neonnum(num) ? "Neon number" : "Not neon num");
		sc.close();
	}
	public static boolean neonnum(int num) {
		int sq = num * num;
		int temp = num;
		int sum = 0;
		while (sq > 0) {
			int digit = sq % 10;
			sum += digit;
			sq /= 10;
		}
		return temp == sum;
		
	}

}
//9