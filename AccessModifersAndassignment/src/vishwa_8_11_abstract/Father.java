package vishwa_8_11_abstract;

public abstract class Father {

	String homeName;
	String where;
	long expect;

	abstract void getFuture(String name,int homeNumber);
	void m1() {
		System.out.println("mmmmmm");
	}
	void m2() {
		System.out.println("mmmmmm");
	}

}
class Son extends Father {
	
	String homeName="VISHWAPREM";
	String where="village";
	long expect= 1500000l;
	
	void m2() {}
	
	void getFuture(String name, int homeNumber) {
		System.out.println(name);
		System.out.println(homeNumber);
	
	}

}
