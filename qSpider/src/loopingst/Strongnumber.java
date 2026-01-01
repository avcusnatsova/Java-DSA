package loopingst;

import java.util.Scanner;

public class Strongnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		strgnum(num);
		System.out.println(strgnum(num) ? "It is a strong number" : "It is not a strong number" );
		sc.close();
	}
	public static int factorial(int num) {
		int res = 1;
		for (int i = 1; i <=num; i++) {
			res *= i;
		}
		return res;
	}
	public static boolean strgnum(int num) {
		int sum = 0;
		int temp = num;
		while(num != 0) {
			int rem = num%10;
			sum+=factorial(rem);
			num/=10;
		}
		return sum == temp;
	}

}
//145