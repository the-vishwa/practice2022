package vishwa_multi_threading;

public class Controller {

	public static void main(String[] args) {
		ChildThread childThread = new ChildThread();
		childThread.start();
		int i = 1000;
		while (i > 0) {

			System.out.println("parent--" + i);
			i--;

		}

	}

}
