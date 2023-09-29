package vishwa_othres;

public class A {

	private String ramSize;
    Integer i;
	A() {
	}

	A(String ramSize) {
		this.ramSize = ramSize;
	}

	private void m1() {
		String mobName = "pocof1";
		String mobCompany = "MI";
		System.out.println(mobName);
		System.out.println(mobCompany);
	}

	public static void main(String[] args) {
		A a = new A("3GB");
		Integer i = 10;
		System.out.println(i);
		String aa = a.getRamSize();
		
		
		System.out.println(aa);
		a.m1();

	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

}
