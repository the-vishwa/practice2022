package loop;

public class ArrayLoop {
	public static void main(String[] args) {

		int[] ar = { 3, 4, 6, 8, 7, 5 };
		
		ArrLoop v = new ArrLoop();
		int r =v.search(ar);
		System.out.println(r);
	}
}
