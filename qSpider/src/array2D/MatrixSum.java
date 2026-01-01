package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {
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
		System.out.println("Array" + Arrays.deepToString(arr));
		System.out.println(sumof(arr, row, col));
		sc.close();
	}
	public static int sumof(int arr[][], int row, int col) {
		int sum = 0;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

}
