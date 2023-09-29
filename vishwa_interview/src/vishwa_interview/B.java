package vishwa_interview;

public final class B {
	// que 11
	private Integer i;
	public B(int i) {
		this.i=i;
	}
	B m1(int i) {
	if(this.i.equals(i)) {
		return this;
	}else {
		return new B(i);
	}
	}
public static void main(String[] args) {
	B b =new B(10);
	B b1 =b.m1(20);
	System.out.println(b.equals(b1));
	System.out.println(b==b1);
	
	
	
	
}
}
