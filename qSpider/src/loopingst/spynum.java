package loopingst;

import java.util.Scanner;

public class spynum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sum(num);
		pro(num);
		System.out.println(sum(num) == pro(num) ? "It is not a spy number" : "It is a spy number");
		sc.close();
	}
	public static int sum(int num) {
		int sum = 0;
		while (num != 0) {
			num = num % 10;
			sum += num;
			num /= 10;
		}
		return sum;
	}
	public static int pro(int num) {
		int pro = 0;
		while (num != 0) {
			num = num % 10;
			pro *= num;
			num /= 10;
		}
		return pro;
	}

}
//123