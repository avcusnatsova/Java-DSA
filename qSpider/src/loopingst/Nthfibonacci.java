package loopingst;

import java.util.Scanner;

public class Nthfibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();
		fibo(num);
		System.out.println(fibo(num));
		sc.close();
		
	}
	public static int fibo(int num) {
	        if (num == 0) return 0;
	        if (num == 1) return 1;

	        int a = 0, b = 1, c = 0;

	        for (int i = 2; i <= num; i++) {
	            c = a + b;
	            a = b;
	            b = c;
	        }

	        return a;
	    }
	
}


