package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
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
		System.out.println("Enter the target: ");
		int target = sc.nextInt();
		System.out.println(Arrays.toString(twoSum(arr, size, target)));
		sc.close();
	}
	public static int[] twoSum(int[] arr, int size, int target) {
		for(int i = 0; i < size - 1; i++) {
			for(int j = i + 1; j < size; j++) {
				if(arr[i] + arr[j] == target) {
					return new int[] {arr[i],arr[j]};
				}
			}
		}
		return new int[] {};
	}
	
	
	}


