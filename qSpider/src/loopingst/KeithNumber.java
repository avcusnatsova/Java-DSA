package loopingst;

import java.util.Scanner;

public class KeithNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(isKeithNumber(num));
	}
	public static int countDigits(int num) {
		int count = 0;
		while(num > 0) {
			count ++;
			num = num / 10;
		}
		return count;
	}
	public static int[] arrayCreation(int num, int digits) {
		int[] arr = new int[digits];
		for(int i = digits - 1; i >= 0; i--) {
			arr[i] = num % 10;
			num = num / 10;
		}
		return arr;
	}
	public static boolean isKeithNumber(int num) {
		int digits = countDigits(num);
		int[] arr = arrayCreation(num, digits);
		while(true) {
			
		if(num < 10) {
			return false;
		}
		int sum = 0;
		for(int i = 0; i < digits; i++) {
			sum += arr[i];
		}
		
		if(sum == num) {
			return true;
		}
		
		if(sum > num) {
			return false;
		}
		
		for(int i = 0; i < digits - 1; i++) {
			arr[i] = arr[i+1];
		}
		arr[digits - 1] = sum;
	}

}
}
