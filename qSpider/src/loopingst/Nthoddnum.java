package loopingst;

import java.util.Scanner;

public class Nthoddnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		nthoddnum(num);
		System.out.println(nthoddnum(num));
		sc.close();
		
	}
	public static boolean checkodd(int num) {
		if (num % 2 != 0) {
			return true;
		}
		return false;
	}
	public static int nthoddnum(int num) {
		int n = 1;
		int count =0;
		while (true) {
			if (checkodd(n)) {
				count ++;
				if (count == num) {
					return n;
				}
				
			}
			n ++;
		}
	}

}
