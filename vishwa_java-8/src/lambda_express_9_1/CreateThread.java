package lambda_express_9_1;

class Child implements Runnable{
// 2nd way and 1st way is like cfreate class and extend thread
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}

public class CreateThread {
public static void main(String[] args) {
	
	
	Child c=  new Child();
	
	Thread t=  new Thread(c); // or new Child()
	t.start();
	
}
}
