package lambda_express_9_1;

//@FunctionalInterface
//interface Runnable {
//	public abstract void run();
//}

public class RunnbleExample {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		Thread tt=  new Thread(r);
		tt.start();

//	Thread t = new Thread(()->{System.out.println(Thread.currentThread().getName());});
//	t.start();

//	new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

	}
}

