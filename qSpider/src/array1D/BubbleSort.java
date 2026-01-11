package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr = new int[size];
		
		//To Store
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//To Print
		for(int i = 0; i <size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(bubblesort(arr, size)));
		sc.close();
		
	}
	public static int[] bubblesort(int arr[], int size) {
		for(int i = 0; i < size; i++) 
		{
			boolean swap = false;
			for(int j = 0; j < size - 1 -i; j++) //reduce the number of times j loop runs
			{
				if(arr[j + 1] < arr[j]) 
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swap = true;
				}
			}
			//optimization to reduce the number of times the round runs
			if(swap == false) {
				break;
			}
		}
		return arr;
	}

}
