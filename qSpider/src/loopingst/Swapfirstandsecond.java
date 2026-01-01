package loopingst;

import java.util.Scanner;

public class Swapfirstandsecond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); {
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		firsthalfsecondhalf(num);
		System.out.println(firsthalfsecondhalf(num));
		sc.close();
		}
		
	}
	public static int countdigit(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}
	public static int powerof(int base, int expo) {
		int res = 1;
		for (int i = 1; i <= expo; i++) {
			res *= base;
		}
		return res;
		
	}
	public static int firsthalfsecondhalf(int num) {
		int count = countdigit(num);
		int pow = powerof(10, count/2);
		int secondhalf = num%pow;
		int firsthalf = num/pow;
		return secondhalf*pow+firsthalf;
	}


}
