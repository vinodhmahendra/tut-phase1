package association;

public class Main {

	public static void main(String[] args) {
		Engine engine = new Engine();
		Car myCar = new Car(engine);
		
		myCar.start();

	}

}
