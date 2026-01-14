package test090126;

public class EvenOdd {
	public static int[] evenodd(int arr[]) {
		int size = arr.length;
		
		int left = 0;
		int right = size - 1;
		
		while(left < right) {
			if(arr[left] % 2 == 0) {
				left ++;
			}
			if(arr[right] % 2 != 0) {
				right ++;
			}
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left ++;
				right --;
			}
		}
		return arr;
	}

}
