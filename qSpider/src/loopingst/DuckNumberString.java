package loopingst;

import java.util.Scanner;

public class DuckNumberString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		String num = sc.next();
		System.out.println(isDuckNumber(num));
		sc.close();
	}
	public static boolean isDuckNumber(String num) {
		if (num.charAt(0) == '0') {
			return false;
		}
		return num.contains("0");
	}

}
