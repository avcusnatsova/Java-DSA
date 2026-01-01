package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class creation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int col = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[][] arr= new int[row][col];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("2D Array: " + Arrays.deepToString(arr));

		sc.close();
	}

}
