package basic_programs;
import java.util.Scanner;
public class scannereg {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the data");
	int a = sc.nextInt();
	System.out.println("Integer data:" +  a);
	byte b = sc.nextByte();
	System.out.println("Byte data" + b);
	short c = sc.nextShort();
	System.out.println("Short data" + c);
	long d = sc.nextLong();
	System.out.println("Long data" + d);
	float e = sc.nextFloat();
	System.out.println("Float data" + e);
	double f = sc.nextDouble();
	System.out.println("Double data" + f);
	boolean g = sc.nextBoolean();
	System.out.println("Boolean data" + g);
	char h = sc.next().charAt(0);
	System.out.println("Char data" + h);
	String s = sc.nextLine();
	System.out.println("String data: " + s);
	sc.close();
}
}
