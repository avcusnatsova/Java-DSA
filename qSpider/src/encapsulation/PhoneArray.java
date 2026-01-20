package encapsulation;

public class PhoneArray {
	String Brand;
	String Model;
	
	//Sim [] s = {new Sim("Airtel"), new Sim("Jio")}; //EARLY
	Sim [] s = new Sim[2];
	
	PhoneArray(String Brand, String Model) {
		this.Brand = Brand;
		this.Model = Model;
	}
	
	//LAZY --- helper method
	public void insertSim(int num, String Company) {
		if(num >= s.length) {
			System.out.println("Invalid slot");
		}
		else {
			if(s[num] == null)
			s[num] = new Sim(Company);
			
			else {
				System.out.println("Sim slot occupied");
			}
		}
	}
	
	public void removeSim(int num) {
		if(num >= s.length) {
			System.out.println("Invalid Slot");
		}
		
		else {
			if(s[num] != null) {
			s[num] = null;
			System.out.println("It is Null");}
			else {
				System.out.println("Sim slot is already empty.");
				
			}
		}
	}
	

}
