package polymophism;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		animal.makeSound();
		myDog.makeSound(); // virtual method invocation
		myCat.makeSound(); //virtual method invocation

	}

}
