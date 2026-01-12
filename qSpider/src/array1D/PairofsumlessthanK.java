package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class PairofsumlessthanK {
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
		System.out.println("Enter the sum: ");
		int k = sc.nextInt();
		System.out.println(pairofsum(arr, size, k));
		sc.close();
	}
	public static int pairofsum(int arr[], int size, int k) {
		int left = 0;
		int right = size - 1;
		int count = 0;
		
		while(left < right) {
			if(arr[left] + arr[right] < k) {
				count += (right - left);
				left ++;
			}
			right --;
		}
		return count;
	}

}
