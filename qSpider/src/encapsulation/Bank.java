package encapsulation;

public class Bank {
	String name;
	private int pin;
	private long accno;
	private double balance;
	
	Bank(String name, int pin, long accno, double balance){
		this.name = name;
		this.pin = pin;
		this.accno = accno;
		this.balance = balance;
	}
	
	public double getBalance(int pin) {
		if(this.pin == pin) {
			return balance;
		}
		else {
			return -1;
		}
	}
		
	
	public double withdraw(double balance) {
		if(this.balance < balance) {
			System.out.println("Insufficient balance");
		}
		else {
			this.balance = this.balance - balance;
		}
			return this.balance;
	}
	
	public double deposit(double balance) {
		this.balance = this.balance + balance;
		return balance;
	}

}
