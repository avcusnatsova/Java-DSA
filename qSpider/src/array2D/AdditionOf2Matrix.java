package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOf2Matrix {
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
		
		if(row1 == row2 && col1 == col2) {
			int [][] res = sumofmatrix(arr1, arr2, row1, col1);
			System.out.println("Result matrix: " + Arrays.deepToString(res));
		}
		else {
			System.out.println("Matrix addition not possible.");
		}
		sc.close();
	}
	public static int[][] sumofmatrix(int arr1[][], int arr2[][], int row, int col){
		int [][] res = new int[row][col];
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				res[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
		return res;
	}

}
