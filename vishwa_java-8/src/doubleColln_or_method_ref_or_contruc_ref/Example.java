package doubleColln_or_method_ref_or_contruc_ref;


interface Logic{
	void show(Integer e);
}

public class Example {
public static void main(String[] args) {
	
	
//	Logic L = (e)->{for (int i = 0; i <= e; i = i + 2)
//		System.out.println(i);
//		};
//		L.show(5);
	
//	instead of using this Expresiion we can dicrtly access that same method by using double colon
	
//	Logic L = new MyOwnLogic() :: m1;
//	L.show(10);
	
	Logic L = MyOwnLogic :: m1;
	L.show(10);
	
	
	
	
}
}

