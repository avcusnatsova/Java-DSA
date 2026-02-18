package othermethods;

import java.util.Arrays;

public class Luckyinteger1394 {

    public int findLucky(int[] arr) {
        int[] freq = new int[501];

        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 500; i > 0; i--) {
            if (i == freq[i]) {
                return i;
            }
        }

        return -1;
    }

    // Main method
    public static void main(String[] args) {

        Luckyinteger1394 sol = new Luckyinteger1394();  // ✅ Correct class name

        int[] arr = {2, 2, 3, 4};

        int result = sol.findLucky(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Lucky Integer: " + result);
    }
}
