package test090126;

public class TwoSum {
	public static int[] twosum(int arr[], int target) {
		int size = arr.length;
		
		int i = 0;
		int j = size-1;
		
		while(i < j) {
			int sum = arr[i] + arr[j];
			
			if(sum == target) {
				return new int [] {arr[i], arr[j]};
			}
			
			else if(sum > target) {
				j --;
			}
			
			else if(sum < target) {
				i ++;
			}
		}
		return new int[] {};
	}

}
