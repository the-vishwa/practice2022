package vishwa_for_practice;

class abc {
	int a;
	int b;

	abc(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a);
		System.out.println(b);
	}

}

public class Constructor {
	public static void main(String[] args) {
		abc a = new abc(2, 3);
		 System.out.println(a.a);
		 System.out.println(a.b);

	}
}
