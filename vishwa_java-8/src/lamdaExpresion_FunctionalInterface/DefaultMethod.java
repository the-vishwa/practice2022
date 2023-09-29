package lamdaExpresion_FunctionalInterface;

interface Graph {
	void findCircleArea(int radius);

	default Double PIValue() {
		return 3.14;
	}
}

class Graphimple1 implements Graph {

	@Override
	public void findCircleArea(int r) {
		// System.out.println(3.14 * r * r); instead of this call that default method
		System.out.println(PIValue() * r * r);

	}

}

class Graphimple2 implements Graph {

	@Override
	public void findCircleArea(int r) {
		// System.out.println((22.0/7.0) * r * r); instead of this call that default
		// method
		System.out.println(PIValue() * r * r);

	}

}

public class DefaultMethod {
	public static void main(String[] args) {
		// new Graphimple1().findCircleArea(7);
		Graph g = new Graphimple1();
		g.findCircleArea(7);
		new Graphimple2().findCircleArea(7);
	}
}
