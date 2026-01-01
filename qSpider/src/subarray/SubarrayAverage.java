package subarray;

import java.util.Arrays;
import java.util.Scanner;

public class SubarrayAverage {
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
		
		System.out.println("Enter the average: ");
		int x = sc.nextInt();
		
		System.out.println();
		
		System.out.print(slidingWindow(arr, size, k, x));
		
		sc.close();
	}
	public static int slidingWindow(int[] arr, int size, int k, int x) {
		int left = 0;
		int windowsum = 0;
		int count = 0;
		int average;
		
		for(int right = 0; right < size; right ++) {
			windowsum = windowsum + arr[right];
			
			if(right - left + 1 == k) {
				average = windowsum / k;
				if(average >= x) {
					count ++;
				}
				windowsum = windowsum - arr[left];
				left ++;
				
			}
		}
		return count;
	}

}
