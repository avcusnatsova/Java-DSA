package typecasting;

public class VehicleTest {
	public static void main(String[] args) {
		vehicle v = new Car();//UPCASTING
		
		Car c = (Car) v;
		
		Bike b = (Bike) v;
		System.out.println(v.brand);
	}

}
