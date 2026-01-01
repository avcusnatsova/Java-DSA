package loopingst;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		fact(num);
		System.out.println(fact(num));
		sc.close();
	}
	public static int fact(int num) {
		if (num < 0) {
			return 0;
		}
		int result = 1;
			for (int i = 1; i <= num; i++) 
			{
				result = result * i;
			}
			return result;
		
	}

}
