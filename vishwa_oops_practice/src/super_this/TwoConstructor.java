package super_this;

class Y{
	Y(int a){
		System.out.println("Y with 1 param" );
	}
	Y(int a, int b){
		System.out.println("Y with 2 param: " +a);
	}
}
class X extends Y{
	X(){
		this(2,1);
	}
    X(int n, int m){
    	super(n,m);
		System.out.println("X with 2 param: " +m);
	}
	
}

public class TwoConstructor {
	public static void main(String[] args) {
		X x = new X(10,20);
	}
}
