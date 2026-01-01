package array1D;

import java.util.Scanner;

public class AverageOfFirstHalf {
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
		System.out.println(average(arr, size));
		sc.close();
		
	}
	public static int average(int[] arr, int size) {
		int sum = 0;
		
		for(int i = 0; i < size/2 ; i++) {
			sum = sum + arr[i];
		}
		
		return  sum/(size/2);
	}

}
