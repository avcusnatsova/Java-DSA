package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class CountNonZerosColWise {
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
		countnonzeros(arr, row, col);
		sc.close();
	}
	public static void countnonzeros(int arr[][], int row, int col) {
		for(int j = 0; j < col; j++) {
			int count = 0;
			for(int i = 0; i < row; i++) {
				if(arr[i][j] != 0) {
					count ++;
				}
			}
			System.out.println("non zero element in column " + j + " is " + count);
		}
	}

}
