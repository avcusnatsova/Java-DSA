package subarray;

import java.util.Arrays;
import java.util.Scanner;

public class SubarrayWithAtmostKoddNum {
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
		
		System.out.println(slidingWindow(arr, size, k));
		sc.close();
	}
	public static int slidingWindow(int [] arr, int size, int k) {
		int left = 0;
		int count = 0;
		int max = 0;
		
		for(int right = 0; right < size; right++) {
			if(arr[right] % 2 != 0) {
				count += 1;
			}
			
			while(count > k) {
				if(arr[left] % 2 != 0) {
					count --;
				}
				left++;
			}
			
				max = Math.max(max, right - left + 1);
			
		}
		return max;
	}

}
