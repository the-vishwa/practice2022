package lamdaExpresion_FunctionalInterface;

interface VV {
	void m1();

	static void Fuu() {

	}
}

interface WW {
	void m2();

	static void Fuu() {

	}
}

class ZZ implements VV, WW {

	@Override
	public void m2() {
		WW.Fuu();

	}

	@Override
	public void m1() {
		VV.Fuu();  // if u want m1 method in WW then call it by that class 

	}

}

public class Statimethod {

}
