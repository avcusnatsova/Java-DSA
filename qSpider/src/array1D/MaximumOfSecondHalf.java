package array1D;

import java.util.Scanner;

public class MaximumOfSecondHalf {
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
		System.out.println(maximumElement(arr, size));
		sc.close();
		
	}
	public static int maximumElement(int[] arr, int size) {
		int max = Integer.MIN_VALUE;
		
		for(int i = size/2; i < size; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
