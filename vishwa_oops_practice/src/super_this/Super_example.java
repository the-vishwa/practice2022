package super_this;


class parent{
	public parent(String a) {
		System.out.println("parent");//
		System.out.println(a);//1
	}
}

class child extends parent{
	public child(String b) {
		super("parent constructor call");
		System.out.println(b);
		System.out.println("child");
	}
}

public class Super_example {
	public static void main(String[] args) {
		child c= new child("i am child");
	}
}
