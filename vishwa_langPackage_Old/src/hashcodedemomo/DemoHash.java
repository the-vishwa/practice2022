package hashcodedemomo;

public class DemoHash {

	int a;
	int b;

	@Override
	public int hashCode() {

		return this.a + this.b;
	}
// remove this to string and run
	@Override
	public String toString() {
		return "DemoHash [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {

		DemoHash d = new DemoHash();
		d.a = 1;
		d.b = 2;
		System.out.println(d.hashCode());
		System.out.println(d);
		
	}
}
