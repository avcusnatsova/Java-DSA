package loopingst;

import java.util.Scanner;

public class AverageOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2: ");
		int num2 = sc.nextInt();
		System.out.println(sumOf(num1, num2));
		System.out.println(subOf(num1, num2));
		sc.close();
	}
	public static int sumOf(int num1, int num2) {
		return num1 + num2;
	}
	public static int subOf(int num1, int num2) {
		return num2 - num1;
	}

}
