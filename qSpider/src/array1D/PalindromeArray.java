package array1D;

import java.util.Scanner;

public class PalindromeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr = new int[size];
		
		//To Store
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//To Print
		for(int i = 0; i <size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(isPalindrome(arr, size));
		sc.close();
	}
	public static boolean isPalindrome(int[] arr, int size) {
		int left = 0;
		int right = size - 1;
		
		while(left < right) {
			if(arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
