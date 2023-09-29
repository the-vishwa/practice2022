package predicates;

interface Predicate<Integer> {
	boolean check(Integer i);
}

class As implements Predicate<Integer>{

	@Override
	public boolean check(Integer i) {
		if(i%2==0) {
			return true;
		}
		return false;
	}
	
}

public class Example {
public static void main(String[] args) {
	Predicate<Integer>mn =(new As());
	System.out.println(mn.check(4));
	
}
}
