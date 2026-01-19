package encapsulation;

public class PhoneTest {
	public static void main(String[] args) {
		Phone obj = new Phone();
		
		obj.insertsim();
		System.out.println(obj.s.Company);
		System.out.println(obj.b);
	}

}
