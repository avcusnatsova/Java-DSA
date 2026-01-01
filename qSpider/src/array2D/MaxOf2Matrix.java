package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOf2Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix 1:");
		System.out.println("Enter the number of rows: ");
		int row1 = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int col1 = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[][] arr1= new int[row1][col1];
		
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < col1; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix 2:");
		System.out.println("Enter the number of rows: ");
		int row2 = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int col2 = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[][] arr2= new int[row2][col2];
		
		for(int i = 0; i < row2; i++) {
			for(int j = 0; j < col2; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array" + Arrays.deepToString(arr1));
		System.out.println("Array" + Arrays.deepToString(arr2));
		
		int max = maxelement(arr1, arr2);
        System.out.println("Maximum element from both matrices: " + max);
        sc.close();
	}
public static int maxelement(int arr1 [][], int arr2[][]) {
	
	int max = arr1[0][0];
	
	for(int i = 0; i < arr1.length; i++) {
		for(int j = 0; j < arr1[0].length; j++) {
			if(arr1[i][j] > max)
				max = arr1[i][j];
			if (arr2[i][j] > max)
				max = arr2[i][j];
		}
	}
	return max;
}
}
