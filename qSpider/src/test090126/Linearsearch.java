package test090126;

public class Linearsearch {
	public static int linearsearch(int arr[], int target) {
		int size = arr.length;
		
		for(int i = 0; i < size ; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
