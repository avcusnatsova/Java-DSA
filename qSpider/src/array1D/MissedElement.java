package array1D;

import java.util.Scanner;

public class MissedElement {
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
		System.out.println("Enter the Max element: ");
		int max = sc.nextInt();
		System.out.println("Enter the Min element: ");
		int min = sc.nextInt();
		System.out.println( missedElement(arr, size, max, min));
		sc.close();
	}
	public static int missedElement(int[]arr, int size, int max, int min) {
		int sum = 0;
		for(int i = 0; i < size; i++) {
			 sum = sum + arr[i];
		}
		int missedelement = ((max - min + 1) * (max + min)) / 2;
		return missedelement - sum;
	}
}
