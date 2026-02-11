package othermethods;

import java.util.Arrays;

public class intersectionoftwoarrays2 {

    public static void main(String[] args) {
    	intersectionoftwoarrays2 sol = new intersectionoftwoarrays2();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = sol.intersection(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        int k = 0;

        int[] res = new int[Math.min(nums1.length, nums2.length)];

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                res[k] =  nums1[i];

                k++;
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] ans = new int[k];
        for(int m =0; m < k; m++){
            ans[m] = res[m];
        }
return ans;
    }
}
