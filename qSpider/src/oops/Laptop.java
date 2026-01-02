package oops;

public class Laptop {
		String model;
		int ram;
		String color;
		double price;
		
		public void gaming() {
			System.out.println("Playing games.");
		}
		
		public void browsing() {
			System.out.println("Browsing...");
		}
		
		public static void main(String[] args) {
			Laptop obj1 = new Laptop();
			System.out.println(obj1);
		}
}
