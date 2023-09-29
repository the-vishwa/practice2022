package finalmodifier;

public class WithInstanceBloc {
	final int a;
	
	
	{
		System.out.println(a=20);
	}
	
	public WithInstanceBloc(int a) {
		this.a=a;
	}
	
	
	
	public static void main(String[] args) {
	WithInstanceBloc b = new WithInstanceBloc();
	b.m1();
		
	}
}
