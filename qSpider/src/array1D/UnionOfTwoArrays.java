package array1D;

import java.util.Scanner;

public class UnionOfTwoArrays {
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
		sc.close();
	}
	//take one array as main array and find the common and uncommon elements
	/*public static int[] commonElements(int[] arr1, int size1, int[] arr2, int size2 ) {
		for(int i = 0; i < size1; i++) {
			
		}*/
	}

//}
