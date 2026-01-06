package oops;

import java.util.Scanner;

public class Car {
	String Brand;
	String Model;
	int year;
	double Price;
	
	Car(String Brand, String Model){
		this.Brand = Brand;
		this.Model = Model;
	}
	Car(String Brand, String Model, int year){
		this(Brand, Model);
		this.year = year;
	}
	Car(String Brand, String Model, double Price){
		this(Brand, Model);
		this.Price = Price;
	}
	Car(String Brand, String Model, int year, double Price){
		this(Brand, Model);
		this.year = year;
		this.Price = Price;
	}
	void display() {
		System.out.println("Brand Name: " + Brand);
		System.out.println("Model: " + Model);
		System.out.println("Year: " + year);
		System.out.println("Price: " + Price);
		System.out.println();
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Car details: ");
		System.out.println("Enter the Brand: ");
		String Brand = sc.next();
		System.out.println("Enter the model: ");
		String Model = sc.next();
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		System.out.println("Enter the price: ");
		double Price = sc.nextDouble();
		
		Car c1 = new Car(Brand, Model,year, Price);
		c1.display();
	}
	

}
