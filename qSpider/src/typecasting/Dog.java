package typecasting;

public class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Dog is barking.");
	}
	
	public void breed() {
		System.out.println("Golden retriever");
	}

}
