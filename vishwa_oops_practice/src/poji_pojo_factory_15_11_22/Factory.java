package poji_pojo_factory_15_11_22;

//factory method ..if that method returned others class object that is called as factory method
//Factory method use- i want to hide from someone that what exactly  internal object type.(object kis chij ka bana rahe ho ye muje hide karna hai)

interface A {
	void sum(int a, int b); // POJI
}

class B implements A {

	@Override
	public void sum(int a, int b) { // POJO
		int s = a + b;
		System.out.println(s);

	}

}

class C implements A {

	@Override
	public void sum(int a, int b) {
		System.out.println(a - b);

	}
}
public interface Factory {
	public static C getObejct() {
		C b = new C();
		return b;
	}

}
