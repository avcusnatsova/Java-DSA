package test090126;

public class Maxnumofevenelements {
	public static int slidingwindow(int arr[], int k) {
		int left = 0;
		int evencount = 0;
		int maxlen = Integer.MIN_VALUE;
		
		for(int right = 0; right < arr.length; right ++) {
			if(arr[right] % 2 == 0) {
				evencount ++;
			}
			
			if(right - left + 1 == k) {
				maxlen = Math.max(maxlen, evencount);
				
				if(arr[left] % 2 == 0) {
					evencount --;
				}
				
				left ++;
			}
		}
		return maxlen;
	}

}
