package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
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
		System.out.println(Arrays.toString(removeDuplicates(arr, size)));
		sc.close();
	}
	public static int[] removeDuplicates(int[] arr, int size) {
		int count = 0;
		for(int i = 0; i < size; i++) {
			if(arr[i] != Integer.MIN_VALUE) {
				for(int j = i + 1; j < size; j++) {
					if(arr[i] == arr[j]) {
						count ++;
						arr[j] = Integer.MIN_VALUE;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		
		int[] res = new int[size - count];
		int pos = 0;
		for(int newarr : arr) {
			if(newarr != Integer.MIN_VALUE) {
				res[pos] = newarr;
				pos++;
			}
		}
		return res;
	}

}
