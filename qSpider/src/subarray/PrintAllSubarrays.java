package subarray;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAllSubarrays {
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
		printSubarrays(arr, size);
		
		
		sc.close();
	}
	public static void printSubarrays(int[] arr, int size) {
		for(int i = 0; i < size - 1; i++) {
			for(int j = i; j < size - 1; j++) {
				for(int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
