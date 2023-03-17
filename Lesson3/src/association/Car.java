package association;

public class Car {
	
	private Engine engine; // Car has an Engine
	
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		engine.start();
		System.out.println("Car started");
	}

}
