package othermethods;

public class leetcode868 {

    public int binaryGap(int n) {
        int lastpos = -1;
        int maxdis = 0;
        int currpos = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                if (lastpos != -1) {
                    maxdis = Math.max(maxdis, currpos - lastpos);
                }
                lastpos = currpos;
            }
            n >>= 1;
            currpos++;
        }
        return maxdis;
    }

    public static void main(String[] args) {
        leetcode868 obj = new leetcode868();

        int n = 22;  // 10110
        int result = obj.binaryGap(n);

        System.out.println("Input: " + n);
        System.out.println("Binary Gap: " + result);
    }
}