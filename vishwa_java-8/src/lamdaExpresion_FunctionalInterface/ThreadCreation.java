package lamdaExpresion_FunctionalInterface;

 //class MyThread implements  Runnable{

//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
//	}

 //}

public class ThreadCreation {
public static void main(String[] args) {
	//MyThread mt =new MyThread();
//	Thread t = new Thread(new MyThread());
//	t.start();
	
	
	//Runnable t = ()->{System.out.println(Thread.currentThread().getName());};
	//Thread t2 = 
			new Thread( ()->System.out.println(Thread.currentThread().getName())).start();
	//t2.start();
	
//	Runnable tt = ()->System.out.println(Thread.currentThread().getName());
//	tt.run();
	
	
	
}
}
