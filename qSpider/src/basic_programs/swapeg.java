package basic_programs;

import java.util.Scanner;

public class swapeg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int a = sc.nextInt();
		System.out.println("Enter num2");
		int b = sc.nextInt();
		System.out.println("Before swapping...");
  	  System.out.println("A : " + a);
  	  System.out.println("B : " + b);
  	  swap(a,b);
  	  sc.close();
	}
      public static void swap(int a, int b) {
    	  a = a+b-(b=a);
    	  //a = a+b;
    	  //b = a-b;
    	  //a = a-b;
    	  //int temp = a;
    	 // a = b;
    	  //b = temp;
    	  System.out.println("After swapping...");
    	  System.out.println("A : " + a);
    	  System.out.println("B : " + b);
      }
}
