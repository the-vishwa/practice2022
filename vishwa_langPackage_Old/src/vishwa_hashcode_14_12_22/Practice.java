package vishwa_hashcode_14_12_22;

class A {
	int x;
	int y;

	@Override
	public String toString() {
		return "x=" + this.x + ",y=" + this.y;

	}

	@Override
	public int hashCode() {
		return this.x+ this.y +6789;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		 A m = (A)obj;
		 if(this.x==m.x&& this.y==m.y) {
			 return true;
		 }

		return false;
	}
	
}

public class Practice {

	public static void main(String[] args) {
		A a = new A();
		a.x = 3;
		a.y = 2;
		
		A a1 = new A();
		a1.x=2;
		a1.y=3;
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		
		System.out.println(a.equals(a1));

	}
}
