package vishwa_doubts_solver;

interface A {

	void sum(int a, int b);
}

class B implements A {

	public void sum(int a, int b) {
		int x = a + b;
		System.out.println(x);

	}

}

class C implements A {

	public void sum(int a, int b) {
		System.out.println(a - b);
	}
}