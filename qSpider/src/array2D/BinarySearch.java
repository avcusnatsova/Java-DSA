package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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
		binary(arr, row, col, target);
		sc.close();
	}
	public static void binary(int arr[][], int row, int col, int target) {
		int low = 0;
		int high = row * col - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			int r = mid / col;
			int c = mid % col;
			
			if(arr[r][c] == target) {
				System.out.println("Element is found at (" + r + "," + c + ")");
				return ;
			}
			else if (arr[r][c] < target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
System.out.println("element not found.");
	}

}
