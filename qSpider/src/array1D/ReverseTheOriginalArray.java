package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheOriginalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		//TO STORE
		System.out.println("Enter the data: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//TO PRINT
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//TO REVERSE
		System.out.println();
		int[] reversedarray = reverseOfArray(arr);
		System.out.println("Reversed Array: ");
		
		//PRINTING BY CONVERTING INTO STRING
			System.out.print(Arrays.toString(reversedarray));
			sc.close();
		
	}
	
	public static int[] reverseOfArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		return arr;
	}
	

}
