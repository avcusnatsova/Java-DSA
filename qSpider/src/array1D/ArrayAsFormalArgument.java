package array1D;


public class ArrayAsFormalArgument {
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		int[] arr2 = {20,30};
		int[] arr3 = {40,50,60,70};
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);

	}
	public static int[] returnArray (int size) {
		int[] arr = new int[size];
		return arr;
	}
	

}
