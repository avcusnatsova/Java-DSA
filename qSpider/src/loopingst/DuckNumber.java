package loopingst;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(isDuckNumber(num));
		sc.close();
	}
	public static boolean isDuckNumber(int num) {
		while(num != 0) {
			int digit = num % 10;
			if (digit == 0) {
				return true;
			}
			num = num / 10;
		}
		return false;
}
}
