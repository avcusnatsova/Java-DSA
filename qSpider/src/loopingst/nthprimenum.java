package loopingst;

import java.util.Scanner;

public class nthprimenum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int num = sc.nextInt();
	    nthprime(num);
	    System.out.println(nthprime(num));
	    sc.close();
	    
	}
	public static boolean checkprime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count ++;
			}
		}
		return count == 2;
	}
	public static int nthprime(int num) {
		int count = 0;
		int n = 2;
		while (true) {
			if (checkprime(n)) {
				count ++;
				if (count==num) {
					return n;
				}
				
			}
			n++;
		}
	}

}
