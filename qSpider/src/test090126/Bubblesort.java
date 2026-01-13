package test090126;

public class Bubblesort {
	public static int[] bubble(int arr[] ){
		int size = arr.length;
		
		for(int i = 0; i < size; i++) {
			boolean swap = false;
			for(int j = 0; j < size - 1- i; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swap = true;
				}
			}
			if(swap == false) {
				break;
			}
		}
		return arr;
	}

}
