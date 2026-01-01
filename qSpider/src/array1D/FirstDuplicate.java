package array1D;

import java.util.Scanner;

public class FirstDuplicate {
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
		System.out.println(firstDuplicate(arr, size));
		sc.close();
	}
	public static int firstDuplicate(int[] arr, int size) {
		for(int i = 1; i < size; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

}
