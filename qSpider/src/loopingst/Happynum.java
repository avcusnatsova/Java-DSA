package loopingst;

import java.util.Scanner;

public class Happynum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		ishappynum(num);
		System.out.println(ishappynum(num) ? "It is a happy number" : "It is a sad number");
		sc.close();
		
	}
	public static boolean ishappynum(int num) {
		while(true) {
			int sum = 0;
			while(num != 0) {
				int digit = num % 10;
				sum += (digit * digit);
				num /= 10;
			}
		if (sum == 1) {
			return true;
		}
		if (sum == 4) {
			return false;
		}
		num = sum;
	}

}
}
//19