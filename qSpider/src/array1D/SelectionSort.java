package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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
		System.out.println(Arrays.toString(selectionsort(arr, size)));
		sc.close();
		
	}
public static int[] selectionsort(int arr[] , int size) {
	for(int i = 0; i < size - 1; i++) {
		int minindex = i;
		for(int j = i + 1; j < size; j++) {
			if(arr[j] < arr[minindex]) {
				minindex = j;
			}
		}
		
		int temp = arr[i];
		arr[i] = arr[minindex];
		arr[minindex] = temp;
		}
	
	return arr;
}
}
