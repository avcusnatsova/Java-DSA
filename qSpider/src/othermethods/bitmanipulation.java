package othermethods;

class BitwiseComplementSolution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;

        int length = (int)(Math.log(n) / Math.log(2)) + 1;
        int mask = (1 << length) - 1;

        return n ^ mask;
    }
}

public class bitmanipulation {
    public static void main(String[] args) {

        BitwiseComplementSolution sol = new BitwiseComplementSolution();

        int n = 5;
        int result = sol.bitwiseComplement(n);

        System.out.println("bitwise complement of " + n + " is: " + result);
    }
}
