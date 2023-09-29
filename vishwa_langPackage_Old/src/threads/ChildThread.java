package threads;

public class ChildThread extends Thread {
	
	
	@Override
	public void run() {
		
		Thread t = new Thread();
		System.out.println(t.currentThread().getName());
		Work w  = new Work();
		w.m1();
		super.run();
	}

}
