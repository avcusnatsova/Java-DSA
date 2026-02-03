package othermethods;

import java.util.Arrays;

public class Twosumsorted {
	public int[] twosum(int[] numbers, int target) {
		int n = numbers.length;
		
		for(int i = 0; i < n ; i++) {
			int left = i + 1;
			
			int right = n - 1;
			
			int need = target - numbers[i];
			
			while(left <= right) {
				int mid = left + (right - left) / 2;
				
				if(numbers[mid] == need) {
					return new int[] {i + 1, mid +1};
				}
				
				else if(numbers[mid] < need) {
					left = mid +  1;
				}
				
				else {
					right = mid - 1;
				}
			}
		}
		return new int[] {};
		}
	
	public static void main(String[] args) {
        Twosumsorted obj = new Twosumsorted();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twosum(numbers, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
	}
