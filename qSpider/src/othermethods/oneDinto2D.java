package othermethods;

public class oneDinto2D {

    // Solution method inside same class
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] res = new int[m][n];

        for (int i = 0; i < original.length; i++) {
            res[i / n][i % n] = original[i];
        }

        return res;
    }

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        int[][] result = construct2DArray(original, m, n);

        // Print the 2D array
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print("Result" + result[i][j] + " ");
            }
            System.out.println();
        }
    }
}