package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastOccurance {
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
		occurance(arr, row, col, target);
		sc.close();
	}
public static void occurance(int arr[][], int row, int col, int target) {
	int firstrow = -1, firstcol = -1;
	int lastrow = -1, lastcol = -1;
	
	for(int i = 0; i < row; i++) {
		for(int j = 0; j < col; j++) {
			if(arr[i][j] == target) {
				if(firstrow == -1) {
					firstrow = i;
					firstcol = j;
				}
				lastrow = i;
				lastcol = j;
			}
		}
	}
	if(firstrow == -1) {
		System.out.println("Element not found");
	}
	else {
		System.out.println("First occurance : (" + firstrow + "," + firstcol + " )");
		System.out.println("Last occurance : (" + lastrow + "," + lastcol + " )");
	}
}
}
