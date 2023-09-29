package lamdaExpresion_FunctionalInterface;

interface Square {
	Integer square(Integer a);
}

public class SquareOfgivenNum {
	public static void main(String[] args) {
		Square sq = a -> a * a;
		// Integer s=
		System.out.println(sq.square(5));
	}
}
