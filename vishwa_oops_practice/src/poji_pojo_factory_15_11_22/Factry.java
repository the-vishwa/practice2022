package poji_pojo_factory_15_11_22;

abstract class AA {
	abstract void sum(int a, int b); // POJI we cant create an object of poji pojo  in abstract  wrong way 
}

class BB extends AA {

	@Override
	public void sum(int a, int b) { // POJO
		int s = a + b;
		System.out.println(s);

	}

}

class CC extends AA {

	@Override
	public void sum(int a, int b) {
		System.out.println(a - b);
	}

}

public class Factry {
	public static CC getObejct() {
		CC b = new CC();
		return b;
	}

	public static void main(String[] args) {
		AA aa = Factry.getObejct();
		aa.sum(10, 20);

	}

}
