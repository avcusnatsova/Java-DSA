package encapsulation;

public class CarEngine {
	public static void main(String[] args) {
		Car obj = new Car();
		
//		System.out.println(obj.Brand);
//		System.out.println(obj.Model);
//		System.out.println(obj.Price);
		
		
		System.out.println(obj.e);
		//System.out.println(obj.e.hsp); CANT ACCESS HSP HERE, CAUSE OBJ ISNT CREATED YET
		obj.openBoots();
		obj.openDoor();
		System.out.println();
		System.out.println(obj.e);
		obj.start();
		System.out.println(obj.e.hsp);
	}

}
