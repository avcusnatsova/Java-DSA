package othermethods;

import java.util.Arrays;

public class strictlyinc {

    static class Solution {
        public boolean canBeIncreasing(int[] nums) {
            int n = nums.length;
            int count = 0;

            for (int i = 1; i < n; i++) {
                if (nums[i] <= nums[i - 1]) {
                    if (++count > 1) {
                        return false;
                    }

                    if ((i > 1 && nums[i] <= nums[i - 2]) 
                        && (i + 1 < n && nums[i + 1] <= nums[i - 1])) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 10, 5, 7};
        int[] nums2 = {2, 3, 1, 2};
        int[] nums3 = {1, 1, 1};

        System.out.println(Arrays.toString(nums1) + " -> " + sol.canBeIncreasing(nums1));
        System.out.println(Arrays.toString(nums2) + " -> " + sol.canBeIncreasing(nums2));
        System.out.println(Arrays.toString(nums3) + " -> " + sol.canBeIncreasing(nums3));
    }
}
