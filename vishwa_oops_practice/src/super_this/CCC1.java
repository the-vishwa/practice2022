package super_this;

class X1 {

	X1() {

		System.out.println("X1 constru");//1
	}

	X1(int a) {
		this();
		System.out.println("vishwa");//2
	}
}

class Y1 extends X1 {
	Y1() {
		this(0);
		System.out.println("y1");//5
	}

	Y1(int a) {
		this(1, 2);
		System.out.println("y1 1");//4
	}

	Y1(int a, int b) {
		super(0);
		// koi nahi matlb super hai
		System.out.println("y1 2"); //3

	}

}

public class CCC1 {
	public static void main(String[] args) {
		Y1 y = new Y1();
	}
}
