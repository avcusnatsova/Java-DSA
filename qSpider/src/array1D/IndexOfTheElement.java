package array1D;

import java.util.Scanner;

public class IndexOfTheElement {
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
		System.out.println("Enter the target: ");
		int target = sc.nextInt();
		System.out.println("The element is at index: ");
		System.out.println(specifiedIndex(arr, size, target));
		sc.close();
		
	}
	public static int specifiedIndex(int[] arr, int size, int target) {
		for(int i = 0; i < size; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
