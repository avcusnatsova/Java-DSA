package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class RotateByKLeft {
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
		System.out.println();
		System.out.println("Enter K: ");
		int k = sc.nextInt();
		
		System.out.println(Arrays.toString(rotateByLeft(arr, size, k)));
		sc.close();
	}
	public static int[] rotateByLeft(int[] arr, int size, int k) {
		k = k % size;
		
		int [] temp = new int[size];
		
		for(int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}
		
		for(int i = k; i < size; i++) {
			arr[i - k] = arr[i];
		}
		
		for(int i = 0; i < k; i++) {
			arr[size - k + i] = temp[i];
		}
		return arr;
	}
}
