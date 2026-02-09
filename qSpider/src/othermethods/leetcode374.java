package othermethods;

public class leetcode374 {
	public int guessNumber(int n) {
	    int left = 1, right = n;

	    while (left <= right) {
	        int mid = left + (right - left) / 2;
	        int res = (mid);

	        if (res == 0) return mid;
	        else if (res == 1) left = mid + 1;
	        else right = mid - 1;
	    }
	    return -1;
	}

}
