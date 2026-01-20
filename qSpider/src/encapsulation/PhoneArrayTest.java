package encapsulation;

public class PhoneArrayTest {
	public static void main(String[] args) {
		PhoneArray obj = new PhoneArray("Apple", "Iphone 16");
		System.out.println(obj); //OBJ 
		System.out.println(obj.s); // OBJ ARRAY
		System.out.println(obj.Brand);
		obj.insertSim(0, "Airtel");
		obj.insertSim(1, "Jio");
		System.out.println(obj.s[0]);//GIVES ADDRESS
		System.out.println(obj.s[0].Company);
		System.out.println(obj.s[1].Company);
		//System.out.println(obj.s[2]);//ARRAY INDEX OUT OF BOUNDS
		//obj.insertSim(0, "BSNL");
		
		obj.removeSim(0);
		
		System.out.println(obj.s[0]);
	}

}
