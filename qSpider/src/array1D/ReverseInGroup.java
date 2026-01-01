package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseInGroup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
	
		
		//TO STORE
		System.out.println("Enter the data: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//TO PRINT
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter the group range: ");
		int k = sc.nextInt();
		
		System.out.println(Arrays.toString(reversearray(arr, size, k)));
		sc.close();
	}
	public static int[] reversearray(int[] arr, int size, int k) {
		for(int i = 0; i < size; i += k) {
			int left = i;
			int right = Math.min(i + k - 1, size - 1);
			
			while( left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left ++;
				right --;
			}
		}
		return arr;
	}
}


