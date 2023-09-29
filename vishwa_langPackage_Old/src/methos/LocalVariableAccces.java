package methos;

public class LocalVariableAccces {

	LocalVar local;

	public LocalVariableAccces(LocalVar local) {
		this.local = local;

	}

	void m1() {
		this.local.m2();

	}

	public static void main(String[] args) {
		LocalVar local = new LocalVar();

		LocalVariableAccces lc = new LocalVariableAccces(local);
		lc.m1();

		
	}
	
	// 16-5-23
	//chek aft 19 -5

}
