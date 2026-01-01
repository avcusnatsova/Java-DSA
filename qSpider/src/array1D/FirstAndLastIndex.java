package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastIndex {
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
		System.out.println(Arrays.toString(firstAndlast(arr, size, target)));
		sc.close();
		
	}
	public static int[] firstAndlast(int[] arr, int size, int target) {
		int first = -1;
		int last = -1;
		
		for(int i = 0; i < size; i++) {
			if(arr[i] == target) {
				if(first == -1) first = i;
				last = i;
			}
		}
		return new int[] {first, last};
	}
	}


