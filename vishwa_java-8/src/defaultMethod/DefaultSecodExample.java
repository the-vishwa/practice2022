package defaultMethod;

interface Graph {
	void findAreaOfCircle(Integer r);// radius

	default Double PIvalue() {

		return 3.14;
	}

}

class BBb implements Graph {

	@Override
	public void findAreaOfCircle(Integer r) {

		System.out.println(PIvalue() * r * r);
	}

}

class CCc implements Graph {

	@Override
	public void findAreaOfCircle(Integer r) {

		System.out.println(PIvalue() * r * r);
	}

}

public class DefaultSecodExample {

	public static void main(String[] args) {

		new BBb().findAreaOfCircle(7);
		new CCc().findAreaOfCircle(7);

	}

}
