package loopingst;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		fibo(num);
		sc.close();
	}
	public static void fibo(int num) {
		int a = 0, b = 1;

        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
		
	}

}

