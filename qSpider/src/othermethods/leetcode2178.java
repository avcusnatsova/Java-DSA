package othermethods;

import java.util.Scanner;

public class leetcode2178 {

	    static class Solution {
	        public int countPairs(int[] nums, int k) {
	            int count = 0;
	            int n = nums.length;

	            for (int i = 0; i < n - 1; i++) {
	                for (int j = i + 1; j < n; j++) {
	                    if (nums[i] == nums[j] && ((long) i * j) % k == 0) {
	                        count++;
	                    }
	                }
	            }

	            return count;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();

	        int[] nums = new int[n];
	        System.out.println("Enter array elements:");

	        for (int i = 0; i < n; i++) {
	            nums[i] = sc.nextInt();
	        }

	        System.out.print("Enter k: ");
	        int k = sc.nextInt();

	        Solution sol = new Solution();
	        int result = sol.countPairs(nums, k);

	        System.out.println("Number of valid pairs: " + result);

	        sc.close();
	    }
	}

