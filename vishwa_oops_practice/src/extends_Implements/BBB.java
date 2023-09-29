package extends_Implements;

interface Je {
	void m1();
}

 abstract class III implements Je {
	public void m1() {
		System.out.println("maratha");
	}
}

public class BBB extends III {
	public void m1() {
		System.out.println("marathi");
	}

	public static void main(String[] args) {
		
		III b = new BBB();
		b.m1();                    // 

	}

}
