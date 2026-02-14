package othermethods;

import java.util.Arrays;

public class Shufflearray {

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int j = 0;

        for(int i = 0; i < n; i++){
            res[j] = nums[i];
            j++;

            res[j] = nums[i + n];
            j++;
        }

        return res;
    }

    public static void main(String[] args) {

        Shufflearray obj = new Shufflearray();

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = obj.shuffle(nums, n);

        System.out.println("Shuffled Array: " + Arrays.toString(result));
    }
}
