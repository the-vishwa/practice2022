package instance_block;

class Parent {

	Parent() {
		System.out.println("I am parent class Constructor");
	}
}

class Child extends Parent {

	Child() {
		this(10);
	}

	Child(int a) {
		System.out.println("CHHHC");
	}

}

public class Demo {

	public static void main(String[] args) {

		Child c = new Child();
	}
}
