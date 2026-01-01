package subarray;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumNumberOfEvenElements {
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
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the subarray size: ");
		int k = sc.nextInt();
		System.out.println();
		
		System.out.println(maximumCount(arr, size, k));
		sc.close();
	}
	public static int maximumCount(int[] arr, int size, int k) {
		int left = 0;
		int count = 0;
		int maxcount = 0;
		
		for(int right = 0; right < size; right++) {
			if(arr[right] % 2 == 0) {
				count++;
			}
			if(right - left + 1 == k) {
				maxcount = Math.max(count, maxcount);
				if(arr[left] % 2 == 0) {
					count--;
				}
				left ++;
			}
		}
		return maxcount;
	}

}
