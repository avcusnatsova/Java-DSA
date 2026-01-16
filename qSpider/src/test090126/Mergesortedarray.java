package test090126;

public class Mergesortedarray {
	public static int[] mergesort(int arr1[], int arr2[]) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int[] res = new int[size1 + size2];
		
		while(i < size1 && j < size2) {
			if(arr1[i] < arr2[j] ) {
				res[k++] = arr1[i++];
			}
			else {
				res[k++] = arr2[j++];
			}
			
		}
		while(i < size1) {
			res[k++] = arr1[i++];
		}
		while(j < size2) {
			res[k++] = arr2[j++];
		}
		
		return res;
	}

}
