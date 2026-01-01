package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class SwapOddIndexWIthEven {
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
		System.out.println(Arrays.toString(swapElements(arr, size)));
		sc.close();
	}
	public static int[] swapElements(int[] arr, int size) {
		for(int i = 1; i < size - 1; i++) {
			if(i % 2 != 0) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return arr;
	}

}
