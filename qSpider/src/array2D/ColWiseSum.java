package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class ColWiseSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int col = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[][] arr= new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("2D Array: " + Arrays.deepToString(arr));
		colSum(arr, row, col);

		sc.close();
	}
	public static void colSum(int arr[][], int row, int col) {
		for(int j = 0; j < col; j++) {
			int sum = 0;
			for (int i = 0; i < row; i++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of col: " + sum);
		}
	}
}


