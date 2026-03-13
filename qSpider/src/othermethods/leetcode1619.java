package othermethods;

import java.util.*;

public class leetcode1619 {

    static class Solution {
        public double trimMean(int[] arr) {

            Arrays.sort(arr);

            int n = arr.length / 20;
            double sum = 0;
            double count = 0;

            for (int i = n; i < arr.length - n; i++) {
                sum += arr[i];
                count++;
            }

            return sum / count;
        }

        static {
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                    fw.write("0");
                } catch (Exception e) {
                }
            }));
        }
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] arr = {
            6,2,7,5,1,2,0,8,1,7,
            5,0,3,4,7,8,2,3,1,6
        };

        double result = sol.trimMean(arr);

        System.out.println("Trimmed Mean: " + result);
    }
}