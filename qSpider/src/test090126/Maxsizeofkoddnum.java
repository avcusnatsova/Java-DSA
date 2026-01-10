package test090126;

public class Maxsizeofkoddnum {
	public static int slidingwindow(int arr[], int k) {
		int left = 0;
		int maxlen = Integer.MIN_VALUE;
		int oddcount = 0;
		
		for(int right = 0; right < arr.length; right++) {
			if(arr[right] % 2 != 0) {
				oddcount++;
			}
			
			while(oddcount > k) {
				if(arr[left] % 2 != 0) {
					oddcount --;
					left ++;
				}
			}
			maxlen = Math.max(maxlen, right - left + 1);
		}
		return maxlen;
	}

}
