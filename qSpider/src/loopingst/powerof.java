package loopingst;

import java.util.Scanner;

public class powerof {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int base = sc.nextInt();
		System.out.println("Enter the exponent");
		int expo = sc.nextInt();
		powerr(base, expo);
		System.out.println(powerr(base, expo));
		sc.close();

	}
	public static int powerr(int base, int expo) {
		int res = 1;
		for (int i = 1; i <= expo; i++) {
			res*= base;
		
	}
		return res;

}
}
