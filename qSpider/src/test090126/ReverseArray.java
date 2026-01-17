package test090126;

public class ReverseArray {
	public static int[] reverse(int arr[]) {
		int size = arr.length;
		int i = 0;
		int j = size - 1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i ] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		return arr;
	}

}
