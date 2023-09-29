package Opertion_On_product_9_1;

import java.util.ArrayList;
import java.util.Iterator;

import collectionAPI_9_1.Product;

public class Used {
	public static Product objectReturn(String name, ArrayList<Product> list) {

		for (Product p : list) {
			if (name.equals(p.getName())) {
				return p;
			}
		}
		return null;
	}

	public static Product getObject(ArrayList<Product> al, String name) {
		Iterator<Product> itr = al.iterator();
		while (itr.hasNext()) {
			Product pp = itr.next();
			System.out.println("abcd");
			if (pp.getName().equals(name)) {
				return pp;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<>();
		Product p3 = new Product(11, "tv", "elx");
		Product p1 = new Product(12, "mobile", "elx");
		Product p2 = new Product(13, "ac", "elx");

		al.add(p3);
		al.add(p1);
		al.add(p2);
//		Product ppp = Used.objectReturn("pen", al);
//		System.out.println(ppp);

		Product pd = Used.getObject(al, "pen");
		System.out.println(pd);

	}
}
