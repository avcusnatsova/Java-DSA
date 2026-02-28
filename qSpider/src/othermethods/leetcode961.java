package othermethods;

import java.util.Arrays;

public class leetcode961 {

    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }

        return -1;
    }

    // Optional: main method to test
    public static void main(String[] args) {
        leetcode961 obj = new leetcode961();
        int[] nums = {1, 2, 3, 3};
        System.out.println("repeated : " + obj.repeatedNTimes(nums));  // Output: 3
    }
}