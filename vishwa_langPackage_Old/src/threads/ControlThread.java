package threads;

public class ControlThread {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t.currentThread().getName());
		ChildThread c = new ChildThread();
		c.setName("vishwa");
		c.start();
		
	}
}
