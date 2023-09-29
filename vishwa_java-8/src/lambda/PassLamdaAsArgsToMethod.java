package lambda;

interface A {

	Integer doSum(Integer a, Integer b);

}

class Imple implements A {

	@Override
	public Integer doSum(Integer a, Integer b) {

		return a + b;
	}

}

class Pass {

	void passAsArgs(A a) {
		Integer i = a.doSum(12, 1);
		System.out.println(i);

	}
 
}

public class PassLamdaAsArgsToMethod {

	public static void main(String[] args) {
//		A aa =  (a,b)-> a+b;  // new Imple();
		Pass p = new Pass();
		p.passAsArgs((a, b) -> a + b);
	}

}
