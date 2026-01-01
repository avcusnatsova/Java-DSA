package loopingst;

import java.util.Scanner;

public class armstrongnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		check(num);
		System.out.println(check(num) ? "Armstrong" : "Not armstrong");
	}
	public static int countdigit(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}
	public static int powerof(int base, int expo) {
		int res = 1;
		for (int i = 1; i <= expo; i++) {
			res *= base;
		}
		return res;
		
	}
	public static boolean check(int num) {
		int expo = countdigit(num);
		int temp = num;
		int sum = 0;
		while (num!=0) {
			int base = num%10;
			sum+= powerof(base, expo);
			num/=10;
		}
		return sum == temp;
	}

}
//153
