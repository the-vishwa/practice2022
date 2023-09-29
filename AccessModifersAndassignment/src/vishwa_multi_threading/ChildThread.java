package vishwa_multi_threading;

public class ChildThread extends Thread {
      
	public void run() {

		int i = 1000;
		while (i > 0) {

			System.out.println("child--" + i);
			i--;

		}

	}

}
