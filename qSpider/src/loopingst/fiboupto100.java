package loopingst;



public class fiboupto100 {
	public static void main(String[] args) {
		fib();

	}
	public static void fib() {
		int a = 0, b = 1, c;
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		while (true) {
			c = a+b;
			if (c>100) {
				break;
			}
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

}
