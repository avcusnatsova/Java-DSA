package oops;

public class Hotel {
	//object variables
	int price;
	String foodname;
	float rating;
	
	//Contructor
	public Hotel(int price, String foodname, float rating) {
		this.price = price;
		this.foodname = foodname;
		this.rating = rating;
	}
	
	//method to display
	public void display() {
		System.out.println("Price:" + price);
		System.out.println("Food:" + foodname);
		System.out.println("Rating:" + rating);
	}
	
	public static void main(String[] args) {
		Hotel f1 = new Hotel(40, "Kal dosai", 4.5f);
		Hotel f2 = new Hotel(40, "Roast", 4.7f);
		f1.display();
		f2.display();
	}

}
