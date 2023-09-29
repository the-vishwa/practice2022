package factoryMethod_Iterator_13_15_1;

interface Cal{
	void sum(int a,int b);
	void sub(int x,int y);
	
}
class Logic implements Cal{

	@Override
	public void sum(int a, int b) {
		System.out.println(a+b);
	}

	@Override
	public void sub(int x, int y) {
	System.out.println(x-y);
	}
}
class Instance{
	static Cal getInstance(){
		Cal c = new Logic();
		return c;
		//return new Logic(); 
	}
	
	Cal getObject(){
		return new Logic();
	}
}
public class FactoryMethod {
public static void main(String[] args) {
	Cal c1 =Instance.getInstance();// static factory
	c1.sub(12, 10);
	Instance i = new Instance();
	Cal c2=i.getObject();// instance factory
	c2.sum(2, 3);
	
}
}
