package vvvv;
class Car extends Vehicle{}
class Road{
	
	void m1(Vehicle v) {
		System.out.println("run");
	}
	void m2(Car c) {
		System.out.println("runv");
	}
		
}

public class Vehicle {

	
	public static void main(String[] args) {
		   Road r = new Road();
		   Vehicle v = new Vehicle();
		   r.m1(v);
		   Car c = new Car();
		   r.m2(c);
}
}


	
