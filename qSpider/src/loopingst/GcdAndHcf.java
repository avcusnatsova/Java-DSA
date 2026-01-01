package loopingst;

import java.util.Scanner;

public class GcdAndHcf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2: ");
		int num2 = sc.nextInt();
		gcdandhcf(num1,num2);
		System.out.println(gcdandhcf(num1,num2));
		sc.close();

		
	}
	public static int gcdandhcf(int num1, int num2) {
		int res = 1;
		for(int i = 1; i <= num1 && i <= num2; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				res= i;
			}
		}
		return res;
	}

}
