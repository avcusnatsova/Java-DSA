package test090126;

public class Maximumlengthsubarraysum {
	public static int slidingwindow(int arr[] , int k) {
		int left = 0;
		int windowsum = 0;
		int maxlength = Integer.MIN_VALUE;
		
		for(int right = 0; right < arr.length; right++) {
			windowsum += arr[right];
			
			while(windowsum > k) {
				maxlength = Math.max(maxlength, right - left + 1);
				windowsum -= arr[left];
				left ++;
			}
		}
		return maxlength == Integer.MIN_VALUE ? 0 : maxlength;
	}

}
