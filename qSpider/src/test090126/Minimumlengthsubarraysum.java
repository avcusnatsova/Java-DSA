package test090126;

public class Minimumlengthsubarraysum {
	public static int slidingwindow(int arr[], int k) {
		int left = 0;
		int smallestlen = Integer.MAX_VALUE;
		int windowsum = 0;
		
		for(int right = 0; right < arr.length; right++) {
			windowsum = windowsum + arr[right];
			
			while(windowsum >= k) {
				smallestlen = Math.min(smallestlen, right - left + 1);
				windowsum -= arr[left];
				left ++;
			}
		}
		return smallestlen == Integer.MAX_VALUE ? 0: smallestlen;
	}

}
