package lambda;

interface GivenNum {

	Integer square(Integer a);

}

public class GivenNumSqaur {

//	@Override
//	public Integer square(Integer a) {
//
//		return a * a;
//	}
	public static void main(String[] args) {
//		GivenNum g = (s) -> {System.out.println(s * s);return s;};
//		GivenNum g = (s) -> {Integer i = s*s;return i;};
//		GivenNum g = s -> {return s * s;};
		GivenNum g = s -> s * s;
		System.out.println(g.square(10));
		

	}

}
