package othermethods;

import java.util.Arrays;

public class rankarray {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] arr = {40, 10, 20, 30, 20};

        int[] result = sol.arrayRankTransform(arr);

        System.out.println("Ranked Array: " + Arrays.toString(result));
    }
}


// Keep Solution class outside OR in same file (without public)
class Solution {

    public int[] arrayRankTransform(int[] arr) {

        if (arr == null || arr.length == 0){
            return new int[0];
        }

        int n = arr.length;

        int[] temp = arr.clone();
        Arrays.sort(temp);

        int[] unique = new int[n];
        int i = 0;

        for(int k = 0; k < n; k++){
            if(k == 0 || temp[k] != temp[k - 1]){
                unique[i++] = temp[k];
            }
        }

        for(int j = 0; j < n; j++){
            int pos = Arrays.binarySearch(unique, 0, i, arr[j]);
            arr[j] = pos + 1;
        }

        return arr;
    }
}
