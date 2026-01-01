package loopingst;

import java.util.Scanner;

public class sumpro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
	    res_sum(num);
	    res_pro(num);
	    countnum(num);
	    System.out.println("sum: " + res_sum(num));
	    System.out.println("product: " + res_pro(num));
	    System.out.println("count: " + countnum(num));
	    
		sc.close();
	}
	public static int res_sum(int num) {
		int sum = 0;
		while(num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}
	public static int res_pro(int num) {
		int pro = 1;
		while (num != 0) {
			int rem = num % 10;
			pro = pro * rem;
			num = num / 10;
		}
		return pro;
	}
	public static int countnum (int num) {
		int count = 0;
		while(num != 0) {
			count ++;
			num = num/10;
		}
		return count;
		
	}

}
