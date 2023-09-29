package oops;

class MMM {

	private void m1() {

		System.out.println("ppp");
	}

	void m2() {
		this.m1();
	}
}

class CCCCC extends MMM {

	private void m1() {

		System.out.println("child");
	}

	void m3() {
		this.m1();
	}

}

public class BBBBB {

	public static void main(String[] args) {

		MMM m = new CCCCC();
		m.m2();
	}
}
