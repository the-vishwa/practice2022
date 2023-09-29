package vvvv;

public class Main {
	Integer a;
	Integer b;

	public Main() {
	}

	public Main(Integer a, Integer b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int hashCode() {

		return this.a.hashCode() + this.b.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Main mm = (Main) obj;
		if (this.a.equals(mm.a) && this.b.equals(mm.b)) {
			return true;
		}
		return false;
	}
//	@Override
//	public String toString() {
//		return "Main [" + a + ", " + b + "]";
//	}

	public static void main(String[] args) {
		Main m = new Main(10, 20);
		Main m1 = new Main(20, 10);

		System.out.println(m.equals(m1));
		System.out.println(m.hashCode());
		System.out.println(m1.hashCode());
	}
}
