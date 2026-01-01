package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumRowIndex {
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
		maxsumrow(arr, row, col);
		sc.close();
	}
	public static void maxsumrow(int arr[][], int row, int col) {
		int maxsum = Integer.MIN_VALUE;
		int index = -1;
		
		for(int i = 0; i < row; i++) {
			int sum = 0;
			for(int j = 0; j < col; j++) {
				sum += arr[i][j];
			}
			if(sum > maxsum) {
				maxsum = sum;
				index = i;
			}
		}
		System.out.println("Max sum is " + maxsum + " With index " + index);
	}

}
