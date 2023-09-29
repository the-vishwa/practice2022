package vishwa_multi;

public class Thread implements Runnable {
	Runnable r;

	Thread() {
	}

	Thread(Runnable r) {
		this.r = r;
	}

	public void run() {
     System.out.println("i am a thread method");
	}

	void start() {
		if (r != null) {
			r.run();
		} else {
			this.run();
		}
	}
}
