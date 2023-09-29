package predicates;

public class A {
	boolean test(Integer i) {
		if (i % 2 == 0) {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {
//		A a = new A();
//		boolean b = a.test(3);
//		System.out.println(b);

		Predicate<Integer> pp = (i) -> {
			if (i % 2 == 0) {
				return true;

			} else {
				return false;
			}
		};

		System.out.println(pp.check(4));

	}
}
