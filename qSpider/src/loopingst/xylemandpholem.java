package loopingst;

import java.util.Scanner;

public class xylemandpholem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		isxylemandpholem(num);
		System.out.println(isxylemandpholem(num) ? "It is xylem and pholem" : "It is not xylem and pholem" );
		sc.close();

	}
	public static boolean isxylemandpholem(int num) {
		int sum1 = 0;
		int sum2 = 0;
		sum1 += num%10;
		num = num/10;
		
		while(num > 9) {
			sum2 += num%10;
			num /= 10;
		}
		sum1 += num;
		return sum1 == sum2;
	}

}
//21201