package decisionmakingprg;
import java.util.Scanner;
public class divisibleby5_11 {

	public static void check(int num) {
		if ((num%5 == 0) & (num%11 == 0)) {
			System.out.println("The number is divisible");
		}
		else {
			System.out.println("The number is not divisible");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		check(num);
		sc.close();
	}
}

// method 2 - create a boolean fn and pass the method call statement directly in the if condition.