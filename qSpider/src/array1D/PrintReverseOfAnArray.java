package array1D;

import java.util.Scanner;

public class PrintReverseOfAnArray {
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
		System.out.println("Reverse of the array: ");
		printReverse(arr, size);
		sc.close();
		
	}
	public static void printReverse(int[] arr, int size) {
		for(int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}
