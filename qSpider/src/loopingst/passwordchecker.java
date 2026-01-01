package loopingst;

import java.util.Scanner;

public class passwordchecker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean condition = false;
		sc.close();
		
		do {
		System.out.println("Enter the password");
		String userpwd = sc.next();
		condition = isvalidpwd(userpwd);
		
		if (condition) {
			System.out.println("Home Page");
		}
		else {
			System.out.println("Error");
		}
		}
		while(!condition);
	
	}
	public static boolean isvalidpwd (String userpwd) {
		String actualpwd = "abc@123";
		return userpwd.equals(actualpwd);
		
	}
}
