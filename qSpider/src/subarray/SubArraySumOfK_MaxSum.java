package subarray;

import java.util.Arrays;
import java.util.Scanner;

public class SubArraySumOfK_MaxSum {
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
		
		System.out.println(Arrays.toString(slidingWindow(arr, size, k)));
		System.out.println(maxSum(arr, size,k));
		sc.close();
	}
	public static int[] slidingWindow(int[] arr, int size, int k) {
		int res_size = (size - k) + 1;
		int[] res = new int[res_size];
		
		int left = 0;
		int windowsum = 0;
		int pos = 0;
		
		for(int right = 0; right < size; right++) {
			windowsum = windowsum + arr[right];
			
			if(right - left + 1 == k) {
				res[pos++] = windowsum;
			windowsum = windowsum - arr[left];
			left++;
			}
		}
		return res;
	}
public static int maxSum(int [] arr, int size, int k) {
	int[] array = slidingWindow(arr,size,k);
	int max = Integer.MIN_VALUE;
	
	for(int i = 0; i < array.length - 1; i++) {
		if(array[i] > max) {
			max = array[i];
		}
	}
	return max;
	
}
	
	
	}


