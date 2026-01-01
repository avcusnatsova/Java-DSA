package basic_programs;

import java.util.Scanner;

public class nexteg {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the data");
	int str1 = sc.nextInt();
	sc.close();
	//sc.nextLine();
	String str2 = sc.nextLine();
	System.out.println("String 1" + str1);
	System.out.println("String 2" + str2);
}
}
