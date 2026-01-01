package array1D;

import java.util.Scanner;

public class Creation {
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
		
		sc.close();
	}
}
