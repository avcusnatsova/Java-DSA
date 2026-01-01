package array1D;

import java.util.Scanner;

public class MaxElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		//TO STORE
		System.out.println("Enter the data: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//TO PRINT
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(maxElement(arr));
		//System.out.println("Maximum Element:" + MaxElement(arr));
		//System.out.println("Second Largest: " + SecondLargestNum(arr));
		//System.out.println("Third largest" + ThirdLastElement(arr));
		sc.close();
			}
	
	public static int maxElement (int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
	/*public static int MinElement(int[] arr) {
		int min= Integer.MAX_VALUE;
		for(int num : arr) {
			if(num < min) {
				min = num;
			}
		}
		return min;
	}*/
	/*public static int SecondLargestNum(int[] arr) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > max1) {
				max2= max1;
				max1 = num;
			}
			else if (num > max2 && num != max1) {
				max2 = num;
			}
		}
		return max2;
	}*/
	/*public static int ThirdLastElement(int[] arr) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			}
			else if(num > max2 && num != max1) {
				max3 = max2;
				max2 = num;
			}
			else if(num > max3 && num != max2 && num != max1) {
				max3 = num;
			}
		}
		return max3;
	
	}*/
}
