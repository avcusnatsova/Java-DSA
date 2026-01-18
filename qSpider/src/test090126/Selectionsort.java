package test090126;

public class Selectionsort {
	public static int[] selection(int arr[]) {
		int size = arr.length;
		
		for(int i = 0; i < size - 1; i++) {
			int minindex = i;
			for(int j = i + 1; j < size; j++) {
				if(arr[j] < arr[minindex] ){
					minindex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
		}
		return arr;
	}
}
