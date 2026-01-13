package test090126;

public class Binarysearch {
	public static int binarysearch(int arr[], int target) {
		int size = arr.length;
		
		int low = 0;
		int high = size - 1;
		
		while(low <= high) {
			int mid = low + ((high - low) / 2);
			
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] < target) {
				low = mid + 1;
			}
			else if(arr[mid] > target) {
				high = mid - 1;
			}
		}
		return - 1;
	}

}
