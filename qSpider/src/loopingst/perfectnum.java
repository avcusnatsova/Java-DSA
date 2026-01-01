package loopingst;

import java.util.Scanner;

public class perfectnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		per(num);
		System.out.println(per(num) ? "It is a perfect number" : "It is not a perfect number");
	}
	public static boolean per(int num) {
		int sum = 0;
		for (int i = 1; i <= num/2 ; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
	
	}
		return sum == num;
	}

}
//6