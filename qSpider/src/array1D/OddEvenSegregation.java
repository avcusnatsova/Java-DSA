package array1D;


import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSegregation {
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
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("Array after rearranging Even elements to front and Odd elements to back:");
		System.out.println(Arrays.toString(oddAndEven(arr, size)));
		sc.close();
	}
	public static int[] oddAndEven(int[] arr, int size) {
		int left = 0;
		int right = size - 1;
		
		while(left < right) {
			if(arr[left] % 2 != 1) {
				left ++;
			}
			else if(arr[right] % 2 != 0) {
				right --;
			}
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		return arr;
	}

}

// even elements in the first half and odd in the last.