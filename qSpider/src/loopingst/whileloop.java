package loopingst;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		whileloopp(num);
	}
	public static void whileloopp(int num) {
		while(num != 0) {
			System.out.println(num%10);
			num = num/10;
		}
	}

}
