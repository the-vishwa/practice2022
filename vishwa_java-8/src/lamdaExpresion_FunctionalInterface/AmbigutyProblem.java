package lamdaExpresion_FunctionalInterface;

interface V {
	void m1();

	default void Fu() {

	}
}

interface W {
	void m2();

	default void Fu() {

	}
}

class Z implements V, W {

	@Override
	public void Fu() {
		V.super.Fu();
	}

	@Override
	public void m1() {

	}

	@Override
	public void m2() {

	}

}

public class AmbigutyProblem {
	public static void main(String[] args) {

	}
}
