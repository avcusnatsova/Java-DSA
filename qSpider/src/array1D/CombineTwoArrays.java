package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class CombineTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array 1: ");
		int size1 = sc.nextInt();
		System.out.println("Enter the elements of array 1: ");
		int[] arr1 = new int[size1];
		for(int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of array 2: ");
		int size2 = sc.nextInt();
		System.out.println("Enter the elements of array 2: ");
		int[] arr2 = new int[size2];
		for(int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println(Arrays.toString(combineArrays(arr1, size1, arr2, size2)));
		sc.close();
		
	}
	public static int[] combineArrays(int[] arr1, int size1, int[] arr2, int size2) {
		int[]  res = new int[size1 + size2];
		int i;
		for(i = 0; i < size1; i++) {
			res[i] = arr1[i];
		}
		
		for(int j = 0; j < size2; j++) {
			res[i] = arr2[j];
			i++;
		}
		return res;
	}

}


