package loopingst;

import java.util.Scanner;

public class LychrelNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(isLychrel(num));
		sc.close();
	}
	public static int reverse(int num){
		int rev = 0;
		while(num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		return rev;
	}
	public static boolean isLychrel(int num) {
		int temp;
		for (int i = 1; i <= 50; i++) {
			temp = reverse(num);
			num = num + temp;
			if (num == reverse(num))
			{
				return false;
			}
		}
		return true;
		
	}

}
