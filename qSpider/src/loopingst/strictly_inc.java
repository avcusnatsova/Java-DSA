package loopingst;

import java.util.Scanner;

public class strictly_inc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		//System.out.println("Enter the number: ");
		//int n = sc.nextInt();
		//check(num);
		//System.out.println(check(num) ? "Strictly increasing" : "Not increasing");
		check2(num);
		System.out.println(check2(num) ? "Strictly decreasing" : "Not decreasing");
		sc.close();
		
	}
	/*public static boolean check(int num) {
		int temp = 10;
		while(num != 0) {
			int rem = num%10;
			if (rem < temp) 
				temp = rem;
			
			else {
				return false;
			}
			num /= 10;
			
		}
		return true;
	}*/
	public static boolean check2(int num) {
		int temp = -1;
		while(num != 0) {
			int rem = num%10;
			if (rem > temp) 
				temp = rem;
			else
				return false;
			num /= 10;
		}
		return true;
	}

}
