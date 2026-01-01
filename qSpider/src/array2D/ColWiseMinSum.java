package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class ColWiseMinSum {
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
		minsumcol(arr, row, col);
		sc.close();
	}
	public static void minsumcol(int arr[][], int row, int col) {
		int minsum = Integer.MAX_VALUE;
		int index = -1;
		
		for(int j = 0; j < col; j++) {
			int sum = 0;
			for(int i = 0; i < row; i++) {
				sum += arr[i][j];
			}
			if(sum < minsum) {
				minsum = sum;
				index = j;
			}
		}
		System.out.println("Min sum is " + minsum + " With index " + index);
	}

}
