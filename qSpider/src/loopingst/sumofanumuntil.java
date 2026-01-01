package loopingst;

import java.util.Scanner;

public class sumofanumuntil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sumuntil(num);
		System.out.println(sumuntil(num));
		sc.close();
		
		
	}
	public static int sumofdigit(int num) {
		int sum = 0;
		while (num != 0) {
		int rem = num % 10;
		sum = sum + rem;
		num /= 10;
	}
		return sum;

}
	public static int sumuntil(int num) {
		while (num > 9) {
			num = sumofdigit(num);
		}
		return num;
	}
}

