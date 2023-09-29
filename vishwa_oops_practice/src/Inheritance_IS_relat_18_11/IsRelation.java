package Inheritance_IS_relat_18_11;

// tightly coupling 
// here we can create only one object
class Bike {
	private String color;
	private int speed;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

class Hero extends Bike { // tight coupling
	public void Work() {
		Engine e = new Engine();
		e.start();
		e.stop();
	}
}

class Engine extends Hero {

	void start() {
		System.out.println("start");
	}

	void stop() {
		System.out.println("stop");
	}

}

public class IsRelation {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.setColor("black");
		h.setSpeed(120);
		String r = h.getColor();
		int r1 = h.getSpeed();
		h.Work();

		System.out.println("bike color is=" + r);
		System.out.println("bike speed is=" + r1);

		// OR print like as above or below

//		System.out.println("bike color is=" + h.getColor());
//		System.out.println("bike speed is=" + h.getSpeed());

	}
}
