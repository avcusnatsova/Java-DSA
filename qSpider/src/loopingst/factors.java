package loopingst;

import java.util.Scanner;

public class factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		findfactors(num);
		sc.close();
	}
	public static void findfactors(int num) {
		int i;
		for (i = 1; i<= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

}
}
