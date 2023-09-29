package Inhertence_HAS_Reltn_18_11;

class Engine {
	void start() {
		System.out.println("Engine started");
	}
}

class Car {
	private final Engine engine; // strong associatiuon if i comment it then it will be get an error

	public Car() {
		this.engine = new Engine();
	}

	void startCar() {
		System.out.println("Car started");
		this.engine.start();
	}
}

public class CompositionExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.startCar();
	}
}
