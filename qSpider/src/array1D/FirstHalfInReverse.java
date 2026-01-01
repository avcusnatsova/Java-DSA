package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class FirstHalfInReverse {
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
		System.out.println(Arrays.toString(reverseArray(arr, size)));
		
		sc.close();
		
	}
	public static int[] reverseArray(int [] arr, int size) {
		
		int left = 0;
		int right = (size/2) - 1;
		
		while(left < right) {
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left ++;
			right --;
		}
		return arr;
	}

}
