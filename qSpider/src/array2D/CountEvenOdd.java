package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class CountEvenOdd {
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
		countof(arr, row, col);
		sc.close();
	}
	public static void countof(int arr[][], int row, int col) {
		int counteven = 0;
		int countodd = 0;
		for(int i = 0; i< row; i++) {
			for(int j = 0; j < col; j++) {
				if(arr[i][j] % 2 == 0) {
					 counteven += 1;
				}
				else if(arr[i][j] % 2 != 0){
					countodd += 1;
				}
			}
		}
		System.out.println("Even number count: " + counteven);
		System.out.println("Odd number count: " + countodd);
		
	}
}
