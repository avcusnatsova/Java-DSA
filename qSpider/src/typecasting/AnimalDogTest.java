package typecasting;

public class AnimalDogTest {
	public static void main(String[] args) {
		Animal a = new Dog();
		// a.breed(); CTE
		
		a.sound(); //child class
		a.eat();  //parent class
	}

}
