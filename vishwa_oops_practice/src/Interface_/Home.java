package Interface_;
// 100% declaration or specification
interface Mother {
	void roti();
	void sabji();
}

class Daughter implements Mother {

	@Override
	public void roti() {
		System.out.println("she made roti");
	}

	@Override
	public void sabji() {
		System.out.println("she made sabji");

	}

}
class Kitchen{
	void made(Mother m) {
		//Mother m1 = new Daughter();
		m.roti();
		m.sabji();
	}
}

public class Home {
public static void main(String[] args) {
	Mother d = new Daughter();
	Kitchen k = new Kitchen();
	 k.made(d);
	
	
}
}
