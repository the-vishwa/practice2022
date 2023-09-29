package super_this;

class parents {
	public parents(String a) {
		System.out.println("parent=" + a);
	}
}

class childs extends parents {
	public childs(String b, String c) {
		super(b);
	}
}

public class Super_example2 {
	public static void main(String[] args) {
		childs c1 = new childs("i am child", "am a parent");
	}
}
