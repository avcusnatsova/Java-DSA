package array1D;

import java.util.Scanner;

public class DistinctElements {
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
		System.out.println("The distinct elements:");
		distinctElement(arr, size);
		sc.close();
	}
	public static void distinctElement(int[] arr, int size) {
		for(int i = 0; i < size; i++) {
			if(arr[i] != Integer.MIN_VALUE) {
				int count = 1;
				for(int j = i + 1; j < size; j++) {
					if(arr[i] == arr[j]) {
						count++;
						arr[j] = Integer.MIN_VALUE;
					}
				}
				if(count == 1) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}

}


