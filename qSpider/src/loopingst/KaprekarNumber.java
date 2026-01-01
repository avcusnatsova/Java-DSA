package loopingst;

import java.util.Scanner;

public class KaprekarNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(isKaprekarNumber(num));
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
	public static int powerof(int base, int expo) {
		int res = 1;
		for(int i = 1; i <= expo; i++) {
			res = res * base;
		}
		return res;
	}
	public static boolean isKaprekarNumber(int num) {
		int temp = num;
		int square = num * num;
		int count = countdigits(square);
		
		
		int half = count / 2;
		int op = powerof(10, half);
		
		int firstHalf = square / op;
		int secondhalf = square % op;
		
		int sum =  firstHalf + secondhalf;

	return temp == sum;
}
}

//9 & 45