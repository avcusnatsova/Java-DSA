package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
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
		
		System.out.println("Array 1:" + Arrays.deepToString(arr1));
		System.out.println("Array 2:" + Arrays.deepToString(arr2));
		
		if(col1 != row2) {
			System.out.println("Matrix Multiplication not possible.");
			return ;
		}
		
		int [][] res = multiply(arr1, arr2);
		System.out.println("Result:" + Arrays.deepToString(res));
		sc.close();
		
	}
public static int[][] multiply(int  arr1[][], int arr2[][] ){
	int r1 = arr1.length;
	int c1 = arr1[0].length;
	int c2 = arr2[0].length;
	
	int [][] res = new int[r1][c2];
	
	for(int i = 0; i < r1; i++) {
		for(int j = 0; j < c2; j++) {
			for(int k = 0; k < c1; k++) {
				res[i][j] += arr1[i][k] * arr2[k][j];
			}
		}
	}
	return res;
}
}
