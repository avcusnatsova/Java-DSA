package loopingst;

import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(isTechNumber(num));
		sc.close();
	}
	
	public static int countdigits(int num) {
		int count = 0;
		while(num != 0) {
			count ++;
			num = num / 10;
		}
		return count;
	}
	
	public static int powerOf( int base, int exp) {
		int res = 1;
		for(int i = 1; i <= exp; i++) {
			res = res * base;
		}
		return res;
		
	}
	public static boolean isTechNumber(int num) {
		int temp = num;
		int digits = countdigits(num);
		if(digits % 2 != 0) {
			return false; 
		}
		
		int half = digits / 2;
		int op = powerOf(10, half);
		
		int firstHalf = num / op;
		int secondhalf = num % op;
		
		int sum =  firstHalf + secondhalf;
		
	
	return temp == sum * sum;

}
}
//2025


