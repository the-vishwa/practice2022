package vvvv;

interface Bata{
	    void logicAdd(int a,int b);
}
class LocalCompany implements Bata{
	@Override
	public void logicAdd(int a, int b) {
		System.out.println(a+b);
	}
}
public class AVJNH {
	public static void main(String[] args) {
		LocalCompany v = new LocalCompany();
		v.logicAdd(39, 1);
	}
}

