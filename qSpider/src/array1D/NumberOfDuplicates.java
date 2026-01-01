package array1D;

import java.util.Scanner;

public class NumberOfDuplicates {
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
		System.out.println("Number of duplicates: " + countDuplicates(arr, size));
		sc.close();
		}
	public static int countDuplicates(int[] arr, int size) {
		int count = 0;
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++ ) {
				if(arr[i] == arr[j]) {
					count ++;
				}
			}
		}
		return count;
	}
	}


