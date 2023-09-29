package vishwa_13_11_child_parent;

class Test {
	void does(Object o) {
		//AM aa = (AM) o;
		//aa.m1();
		AM aa = new AM();
		aa.m1();
		
	}
}
public class Xyz {
	public static void main(String[] args) {
		Test t = new Test();
		AM a = new AM();
		t.does(a);
	}
}
class AM {
	void m1() {
		System.out.println("am a m1 method of AM class");
	}
}