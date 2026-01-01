package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
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
		System.out.println("Enter the element to be searched: ");
		int target = sc.nextInt();
		linear(arr, row, col, target);
		sc.close();
	}
public static void linear(int arr[][], int row, int col, int target) {
	boolean found = false;
	
	for(int i = 0; i < row; i++) {
		for(int j = 0; j < col; j++) {
			if(arr[i][j] == target) {
				System.out.println("(" + i + "," + j + ")");
				found = true;
				return;
			}
		}
	}
	if(!found) {
		System.out.println("Element doesnt exist.");
	}
}
}
