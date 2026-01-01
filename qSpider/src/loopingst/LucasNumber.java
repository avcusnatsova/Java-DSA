package loopingst;

import java.util.Scanner;

public class LucasNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(fibo(num));
		sc.close();
	}
	public static int fibo(int num) {
		int a = 2, b = 1;

	    if (num == 1) return a;
	    if (num == 2) return b;

	    for (int i = 3; i <= num; i++) {
	        int c = a + b;
	        a = b;
	        b = c;
	    }
	    return b;
		}
	}


