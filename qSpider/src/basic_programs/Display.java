package basic_programs;

public class Display {
public static void main(String[] args) {
	int value=show(10);
	System.out.println(value);
	System.out.println(show("Welcome to java class"));
	System.out.println(show(13.04));
}
public static int show(int a) {
	return a;
}
public static String show(String str) {
	return str;
}
public static double show(double a) {
	return a;
}
}
