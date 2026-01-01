package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEvenIndexedElements {
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
		System.out.println(Arrays.toString(reverseElements(arr, size)));
		sc.close();
	}
	public static int[] reverseElements(int[] arr, int size) {
		int left = 0;
		int right = size - 1;
		
		while(left < right) {
			if(size % 2 == 0) {
				right = size - 1;
			}
			else {
				right = size - 2;
			}
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left +=2;
			right -=2;
		}
		return arr;
	}

	}


