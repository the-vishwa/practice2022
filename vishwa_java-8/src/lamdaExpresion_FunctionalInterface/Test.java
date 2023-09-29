package lamdaExpresion_FunctionalInterface;

interface Cal {
	public void add(int a, int b);
}

//class Calimpl implements Cal {
//	@Override
//	public void add(int a, int b) {
//		System.out.println(a + b);
//
//	}
//
//}

public class Test {
	//normal way
	public static void main(String[] args) {
//		Cal c = new Calimpl();
//		c.add(10, 10);

		// with the help of lamda expresion
		Cal cc = (a, b) -> System.out.println(a + b);
		cc.add(20, 20);
	}

}
