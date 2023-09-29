package vishwa_18_11_inheritance_reuse;

public class Solver {

	public static void main(String[] args) {

		DoMinusOpertaion D = new DoMinusOpertaion();
		int a = 10;
		int b = 20;
		int v = D.minus(a, b);
		                                                                       //System.out.println(v); // 	System.out.println(D.minus(20, 30));
		Output o = new Output();
		o.OutputAns(v);
	}

}
