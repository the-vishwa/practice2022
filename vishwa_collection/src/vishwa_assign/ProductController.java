package vishwa_assign;

import java.util.ArrayList; 
import java.util.Iterator;

public class ProductController {
public static void main(String[] args) {
	ArrayList<Product> al = new ArrayList<Product>();
	Product p = new Product(1,"mobile","electronic",15000);
	Product p1 = new Product(2,"book","study material",150);
	Product p2 = new Product(3,"TV","electronic",150000);
	Product p3 = new Product(4,"Freeze","electronic",25000);
	
	al.add( new Product(1,"mobile","electronic",15000));
	al.add( new Product(2,"book","study material",150));
	al.add( new Product(3,"TV","electronic",150000));
	al.add( new Product(4,"Freeze","electronic",25000));
	
	for(int i= 0; i < al.size() ; i++) {
		Product pp  = al.get(i);
		System.out.println(pp);
	}
	
	// using while loop
	int j = 0;
	while(j < al.size()) {
		Product pp  = al.get(j);
		//System.out.println(pp);
		j++;
	}
	
	// forEach // generic type
	for(Product pp : al) {
		//System.out.println(pp);
	}
	
	// cursor (api which are going to help to travel collection objects)
	//Iterator<E>
	//ListIterator<E>
	//Enumeration<E>
	Iterator<Product> itr = al.iterator();
	while(itr.hasNext()) {
		Product pp = itr.next();
		//System.out.println(pp);
	}
	
}


	
	
	
	
}

