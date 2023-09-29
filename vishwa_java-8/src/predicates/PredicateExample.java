package predicates;

//interface Predicate<Integer> {
//	boolean check(Integer i);
//}

public class PredicateExample {
public static void main(String[] args) {
//	Predicate<Integer> p1 = i->i % 5 == 0;
//	Predicate<Integer> p2 = i->i % 2 == 0;
	
	// OR
	
	Predicate<Integer> p = i->{
		if (i % 5 == 0 && i%2==0) {  
			return true;

		} else {
			return false;
		}
	};
System.out.println( p.check(10));    // 10 is even and devided by 5 if yes then true else false 
//System.out.println( p2.check(25));    // 25 is even and devided by 5 if yes then true else false 
}
}
