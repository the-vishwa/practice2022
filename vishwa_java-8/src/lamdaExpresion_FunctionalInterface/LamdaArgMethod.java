package lamdaExpresion_FunctionalInterface;

interface Addition {
	int doSum(int a, int b);
}

class Aimpl implements Addition {

	@Override
	public int doSum(int a, int b) {
		return a + b;
	}

}

class OperationOn {
	void doCal(Addition a) {
		int sum = a.doSum(2, 2);
		System.out.println(sum);
	}
}

public class LamdaArgMethod {
	public static void main(String[] args) {

		OperationOn op = new OperationOn();
		 Addition aa =(a,b)->a+b;
		 System.out.println(aa.doSum(3, 4));
		// or
		// op.doCal((x,y)-> x+y);
		 //or
		// op.doCal(new Aimpl());
		
		Addition ad = new Aimpl();
		// op.doCal(new Aimpl());
		op.doCal(ad);
	}
}
