package test090126;

public class Reversebyposition {
	
	public static int[] reversebyleft(int arr[], int k) {
		int n = arr.length;
		
		k = k % n;
		
		reverse(arr, 0 , k-1);
		reverse(arr, k , n-1);
		reverse(arr, 0, n-1);
		
		return arr;
		
	}
	
	
	public static int[] reversebyright(int arr[] , int k) {
		int n = arr.length;
		
		k = k% n;
		
		reverse(arr, 0 , n-1);
		reverse(arr, 0, k -1);
		reverse(arr, k, n-1);
		
		return arr;
	}
	
	
	public static int[] reverse(int arr[], int left, int right) {
		while(left < right) {
			int temp  = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left ++;
			right --;
		}
		return arr;
	}

}
