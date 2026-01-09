package encapsulation;

public class Bank2 {
	public static void main(String[] args) {
		Bank b = new Bank("Cusnat", 223344, 1234567, 1000);
		System.out.println(b.getBalance(223344));
		b.withdraw(500);
		System.out.println(b.getBalance(223344));
		b.deposit(1000);
		System.out.println(b.getBalance(223344));
	}
}
