package array1D;

import java.util.Scanner;

public class SumOfEvenIndexedElement {
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
		System.out.println("Sum of even indexed elements: " + sumOfElements(arr, size));
		sc.close();
		}
		public static int sumOfElements(int[] arr, int size) {
            int sum = 0;
			for(int i = 0; i < size; i++) {
				if(i % 2 == 0) {
					sum += arr[i];
				}
			}
			return sum;
		}
}
