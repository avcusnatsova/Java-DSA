package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElementByIndex {
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
		System.out.println("Enter the index 1: ");
		int index1 = sc.nextInt();
		
		System.out.println("Enter the index 2: ");
		int index2 = sc.nextInt();
		
		System.out.println();
		System.out.println(Arrays.toString(swapIndexedElement(arr, size, index1, index2)));
		sc.close();
	}
	public static int[] swapIndexedElement(int[] arr, int size, int index1, int index2) {
		
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
			
		return arr;
	}

}
