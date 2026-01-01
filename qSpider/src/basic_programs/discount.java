package basic_programs;

public class discount {
public static void main(String[] args) {
	double price=5000;
	double finalprice=price>1000?(price-(price*0.10)): (price-(price*0.5));
	System.out.println(finalprice);
}
}