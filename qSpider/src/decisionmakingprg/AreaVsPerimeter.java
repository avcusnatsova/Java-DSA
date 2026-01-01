package decisionmakingprg;
import java.util.Scanner;
public class AreaVsPerimeter {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();
        sc.close();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        if (area > perimeter) {
            System.out.println("Area is greater than perimeter");
        } else {
            System.out.println("Area is not greater than perimeter");
        }
    }

}
