package vishwa_assign;

import java.util.ArrayList;
import java.util.Iterator;

public class Using_For_while_ForEach_and_Iterator {

	public static void getproduct(Integer productId, ArrayList<Product> list) {
// 1] using for loop
		for (int i = 0; i < list.size(); i++) {
			Product pt = list.get(i);
			if (pt.getProductId().equals(productId)) {
				// System.out.println(pt);
			}
		}
 // 2] using while loop
		int j = 0;
		while (j < list.size()) {
			Product ppp = list.get(j);
			if (ppp.getProductId().equals(productId)) {
				// System.out.println(ppp);
				j++;
			}
		}
// 3] using forEach // generic type
		for (Product ppt : list) {
			if (ppt.getProductId().equals(productId)) {
				System.out.println(ppt);
			}
		}
//using Iterator
		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			Product cc = itr.next();
			if (cc.getProductId().equals(productId)) {
				// System.out.println(cc);

			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		Product p = new Product(1, "mobile", "electronic", 15000);
		Product p1 = new Product(2, "book", "study material", 150);
		Product p2 = new Product(3, "TV", "electronic", 150000);
		Product p3 = new Product(4, "Freeze", "electronic", 25000);

		al.add(new Product(1, "mobile", "electronic", 15000));
		al.add(new Product(2, "book", "study material", 150));
		al.add(new Product(3, "TV", "electronic", 150000));
		al.add(new Product(4, "Freeze", "electronic", 25000));

		getproduct(1, al);

	}
}
