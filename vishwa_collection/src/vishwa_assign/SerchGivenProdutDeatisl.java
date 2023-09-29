package vishwa_assign;

import java.util.ArrayList; 
import java.util.Iterator;

public class SerchGivenProdutDeatisl {
	public static void getproducts(String productName, ArrayList<Product> list) {
//	for (Product product : list) {
//		if (productName.equals(product.getProductName())) {
//			System.out.println(product);
//		}
//	}
	
		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			Product p = itr.next();
			if (p.getProductName().equals(productName)) {
				System.out.println(p);
			}

		}

	}

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product(1, "TV", "electronic", 100000));
		al.add(new Product(2, "pen", "study material", 500));
		al.add(new Product(3, "mobile", "electronic", 50000));
		al.add(new Product(4, "notebook", "study matrial", 50));

		getproducts("pen", al);

	}

}
