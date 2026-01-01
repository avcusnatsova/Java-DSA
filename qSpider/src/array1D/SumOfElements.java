package array1D;

public class SumOfElements {
	
	public static int sumOfelements(int[] arr) {
		int sum = 0;
		
		for(int i : arr) {
			sum += arr[i];
		}
		return sum;
	}

}
