package othermethods;

import java.util.Arrays;

public class Intersection {

    public static void main(String[] args) {
        Intersection sol = new Intersection();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = sol.intersection(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean exists = false;

                    for (int x = 0; x < k; x++) {
                        if (res[x] == nums1[i]) {
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        res[k++] = nums1[i];
                    }
                }
            }
        }

        int[] temp = new int[k];
        for (int m = 0; m < k; m++) {
            temp[m] = res[m];
        }
        return temp;
    }
}
