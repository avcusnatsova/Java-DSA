package othermethods;

public class poweroftwo {
	

	    public boolean isPowerOfTwo(int n) {
	        return n > 0 && (n & (n - 1)) == 0;
	    }

	    public static void main(String[] args) {
	        poweroftwo sol = new poweroftwo();

	        int[] testCases = {1, 2, 3, 4, 5, 8, 16, 18, 0, -4};

	        for (int n : testCases) {
	            System.out.println("n = " + n + " → " + sol.isPowerOfTwo(n));
	        }
	    }
	}


