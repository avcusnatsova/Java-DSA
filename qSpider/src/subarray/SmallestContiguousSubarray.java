package subarray;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestContiguousSubarray {
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
		System.out.println("Enter the subarray sum: ");
		int k = sc.nextInt();
		System.out.println();
		
		System.out.println(slidingWindow(arr, size, k));
		sc.close();
	}
	public static int slidingWindow(int[] arr, int size, int k) {
		int left = 0;
		int smallestlen = Integer.MAX_VALUE;
		int windowsum = 0;
		
		for(int right = 0; right < size; right++) {
			windowsum = windowsum + arr[right];
			
			while(windowsum >= k) {
				
				smallestlen = Math.min(smallestlen, right - left + 1);
				windowsum = windowsum - arr[left];
				
				left ++;
			}
		}
		return (smallestlen == Integer.MAX_VALUE ? 0 : smallestlen);
	}

}
