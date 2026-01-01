package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveOddAndFillZero {
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
		System.out.println(Arrays.toString(removeOdd(arr, size)));
		sc.close();
	}
	public static int[] removeOdd(int[] arr, int size) {
		for(int i = 0; i < size - 1; i++) {
			if(arr[i] % 2 != 0) {
				arr[i] = 0;
			}
		}
		return arr;
	}

}
