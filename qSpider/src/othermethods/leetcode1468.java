package othermethods;

public class leetcode1468 {

    public int xorOperation(int n, int start) {
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= (start + 2 * i);
        }
        return xor;
    }

    public static void main(String[] args) {
        leetcode1468 sol = new leetcode1468();

        int n = 4;
        int start = 3;

        int result = sol.xorOperation(n, start);
        System.out.println("XOR Result: " + result);
    }
}