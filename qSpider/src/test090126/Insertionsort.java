package test090126;

public class Insertionsort {
	public static int[] insertion(int arr[]) {
		int size = arr.length;
		
		for(int i = 1; i < size; i++) {
			int j = i - 1;
			
			int temp = arr[i];
			
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return arr;
	}

}
