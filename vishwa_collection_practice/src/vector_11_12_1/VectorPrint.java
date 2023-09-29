package vector_11_12_1;

import java.util.Vector;

public class VectorPrint {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();

		for (int i = 10; i <= 110; i = i + 10) {
			v.add(i);
		}
		System.out.println(v.size()); //11
		System.out.println(v.capacity());// 20
	}
}
