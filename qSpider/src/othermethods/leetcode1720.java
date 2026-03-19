package othermethods;

public class leetcode1720 {

    static class Solution {
        public int[] decode(int[] encoded, int first) {
            int[] res = new int[encoded.length + 1];
            res[0] = first;

            for (int i = 1; i < res.length; i++) {
                res[i] = res[i - 1] ^ encoded[i - 1];
            }

            return res;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] encoded = {1, 2, 3};
        int first = 1;

        int[] result = obj.decode(encoded, first);

        for (int num : result) {
            System.out.print(num + "->");
        }
    }
}
