package array1D;

import java.util.Scanner;

public class MinimumOfEvenIndexedElement {
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
		System.out.println(minimumElement(arr, size));
		sc.close();
		}
	public static int minimumElement(int[] arr, int size) {
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < size; i++) {
			if( i % 2 == 0) {
				if (arr[i] < min)
				min = arr[i];
			}
		}
		return min;
	}
}
