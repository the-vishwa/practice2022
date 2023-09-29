package Inheritance_17_11;

class MM {
	void m1() {
		System.out.println("m1 MM111");
	}
}

class NN extends MM {

}

public class Tightly_coupling {
	public static void main(String[] args) {
		NN nn = new NN();
		nn.m1();
	}
}
