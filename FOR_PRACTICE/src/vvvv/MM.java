package vvvv;


class NN {
	public NN() {
		System.out.println("NN");
	}
	public NN(int a) {
		System.out.println("NN values");
	}
}

public class MM extends NN{
	MM(){
		super(0);
		System.out.println("MM");
	}
	
	public static void main(String[] args) {
		MM m= new MM();
	}
}
