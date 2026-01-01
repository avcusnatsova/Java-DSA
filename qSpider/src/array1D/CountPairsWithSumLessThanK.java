package array1D;
//Brute Force

import java.util.Scanner;

public class CountPairsWithSumLessThanK {
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
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
				if(arr[i] + arr[j] < target) {
					count ++;
				}
			}
		}
		return count;
	}
	
	
	}


