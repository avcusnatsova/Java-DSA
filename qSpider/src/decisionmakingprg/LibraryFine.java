package decisionmakingprg;
import java.util.Scanner;
public class LibraryFine {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        sc.close();
        if (days <= 5) {
            System.out.println("Fine: Rs. 0.50");
        } 
        else if (days <= 10) {
            System.out.println("Fine: Rs. 1");
        } 
        else if (days <= 30) {
            System.out.println("Fine: Rs. 5");
        } 
        else {
            System.out.println("Membership cancelled");
        }
    }

}
