package super_this;
//que - if there will not be created abstract class obj then who will call that constructor..?
// ans is child class constructor with super
abstract class BB{
	int a;
	int b;
	public BB() {}
	public BB(int a,int b,String s) {
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		
	}
}

public class  AAA extends BB {
	public AAA() {
		super(10,20,"msg");//we can give values in child (super() construct) for parent constru 
		System.out.println("i am a child constru");
	}

public static void main(String[] args) {
	AAA b = new AAA();
	
	
}
}
