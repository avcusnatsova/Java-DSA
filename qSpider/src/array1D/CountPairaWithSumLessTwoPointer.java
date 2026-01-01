package array1D;

import java.util.Scanner;

public class CountPairaWithSumLessTwoPointer {
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
		System.out.println("Enter the target: ");
		int target = sc.nextInt();
		System.out.println("count of pairs: " + countPairs(arr, size, target));
		sc.close();
	}
	public static int countPairs(int[] arr, int size, int target) {
		int count = 0;
		int left = 0;
		int right = size - 1;
		
		while(left < right) {
			int sum = arr[left] + arr[right];
			
			if(sum < target) {
				count += (right - left);
				left ++;
			}
			else
				right --;
		}
		return count;
	}
	
	}


