package array2D;
import java.util.Arrays;
import java.util.Scanner;
public class jaggedarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		
		int[][] arr = new int[row][];
		
		//Iterate through each row
		for(int i = 0; i < row; i++) {
			
			System.out.println("Enter the number of columns: ");
			
			//get column size
			int col = sc.nextInt();
			
			//create array of column size
			arr[i] = new int [col];
			
			System.out.println("Enter elements: ");
			//get elements
			for(int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();			}	
		}
		System.out.println(Arrays.deepToString(arr));
		sc.close();
	}
}


