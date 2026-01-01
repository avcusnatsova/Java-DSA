package subarray;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestContiguousSubarrayBruteforce {
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
		
		System.out.println(subarraysum(arr, size, k));
		sc.close();
	}
	public static int subarraysum(int[] arr, int size, int k) {
	int min = Integer.MAX_VALUE;
	
	for(int i = 0;i < size; i++) {
		int sum = 0;
		for(int j = i; j < size; j++) {
			sum += arr[j];
			
			if(sum >= k) {
				min = Math.min(sum, j - i + 1);
			}
		}
	}
	return (min == Integer.MAX_VALUE ? 0 : min);
		
	}

}
