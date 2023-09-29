package collectionAPI_9_1;

import java.util.ArrayList;
import java.util.Iterator;

public class OptOnproductWithhelpOfAL {
	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<>();
		Product p = new Product(11, "tv", "elx");
		Product p1 = new Product(12, "mobile", "elx");
		Product p2 = new Product(13, "ac", "elx");
		// 2 way to add an obj
		// 1
		al.add(p);
		al.add(p1);
		al.add(p2);
		// 2
		// al.add(new Product(11, "tv", "elx"));
		// using for loop
		for (int i = 0; i < al.size(); i++) {
			Product s = al.get(i);
			System.out.println("--" + s);
		}
		// using while loop
		int j = 0;
		while (j < al.size()) {
			Product ss = al.get(j);
			System.out.println(ss);
			j++;
		}
		// using for each
		for (Product pp : al) {
			System.out.println(pp);
		}

		Iterator<Product> itr = al.iterator();
		while (itr.hasNext()) {
			Product n = itr.next();
			System.out.println(n);

		}

	}
}
