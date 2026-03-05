package othermethods;

public class leetcode1758 {

    public static int minOperations(String s) {
        int curr1 = 0;
        int curr2 = 0;

        for (int i = 0; i < s.length(); i++) {
            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != expected1) curr1++;
            if (s.charAt(i) != expected2) curr2++;
        }

        return Math.min(curr1, curr2);
    }

    public static void main(String[] args) {
        String s = "0100";  // Change input here
        int result = minOperations(s);
        System.out.println("Minimum operations needed: " + result);
    }
}