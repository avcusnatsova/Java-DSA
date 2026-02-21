package othermethods;

public class leetcode1991 {

    public static void main(String[] args) {

        int[] nums = {2, 3, -1, 8, 4};

        int result = findMiddleIndex(nums);

        System.out.println("Middle Index: " + result);
    }

    public static int findMiddleIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i]) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}