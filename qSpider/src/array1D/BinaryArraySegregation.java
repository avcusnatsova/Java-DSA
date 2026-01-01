package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryArraySegregation {
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
		System.out.println();
		
		System.out.println(Arrays.toString(segregate(arr, size)));
		sc.close();
	}
	public static int[] segregate(int[] arr, int size) {
		int left = 0;
		int right = size - 1;
		
		while(left < right) {
			if(arr[left] == 1) {
				left++;
			}
			else if(arr[right] == 0) {
				right--;
			}
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		return arr;
	}

}
