package predicates2;


interface Predicate<Integer>{
	
	Boolean test(Integer a);
}


 public class PredicateExample {
	
	
	public static void main(String[] args) {
		
		
	Predicate<Integer> p = (v)->{if (v % 2 == 0) {return true;} else {return false;}};
	System.out.println(p.test(3));

	}
}
