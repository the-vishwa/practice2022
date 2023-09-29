package SET_Impl_classess;

import java.util.HashSet;

public class HashsSetDemo {
public static void main(String[] args) {
	HashSet<Integer> h = new HashSet<>();
	System.out.println(h.add(10)); //true
	System.out.println(h.add(20));//true
	System.out.println(h.add(30));// true
	System.out.println(h.add(null));//true
	System.out.println(h.add(10));//false
	System.out.println(h.add(null));//false
	System.out.println(h.add(40));//true
	
	System.out.println(h); // here insertion order doesn't  follow
	System.out.println(h.size());
	
}
}
