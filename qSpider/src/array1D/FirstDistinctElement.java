 package array1D;


import java.util.Scanner;


public class FirstDistinctElement {
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
		System.out.println(distinctElement(arr, size));
		sc.close();
	}
	public static int distinctElement(int[]  arr, int size) {
		for(int i = 0; i < size; i++) {
			int count = 0;
			for(int j = 0; j < size; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 1) {
			return arr[i];
			}
		}
		return -1;
	}

}
