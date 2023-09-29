package treeMap_8_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

//delete all methods for another one program
public class Cust_Items {

	private TreeMap<Customer, List<Iteam>> tree;
	// private List<Iteam> list;

	public Cust_Items() {
		this.tree = new TreeMap<>();
//		this.list = new ArrayList<>();
//		list.add(new Iteam(101, "book", 50.50, 5));
//		list.add(new Iteam(102, "pen", 5.0, 10));
//		list.add(new Iteam(103, "erazer", 3.60, 15));
//		list.add(new Iteam(104, "pencile", 15.70, 10));
//
//		tree.put(new Customer(23, "manjiri"), list);
//		tree.put(new Customer(24, "nayanti"), list);
//		tree.put(new Customer(25, "dhruvi"), list);
//		tree.put(new Customer(26, "sneha"), list);

//		Set<Customer> set = tree.keySet();
//		for (Customer key : set) {
//			List<Iteam> value = tree.get(key);
//			System.out.println("           "+key);
//
//			for (Iteam i : value) {
//				System.out.println(i);
//
//			}
//
//		}

	}

	public void addCustomerDetails(Customer c, List<Iteam> list) {
		this.tree.put(c, list);
	}

	public void showCustDetails() {
		Set<Customer> sett = tree.keySet();
		for (Customer key : sett) {
			List<Iteam> value = tree.get(key);
			System.out.println(key);
			System.out.println(value);
			
			
//			for (Iteam itm : value) {
//				System.out.println(itm);
//			}
		}
	}

}

//Iterator<Customer> itr = set.iterator();
//while (itr.hasNext()) {
//	Customer key = itr.next();
//	System.out.println("                   "+key);
//	List<Iteam> value = tree.get(key);
//	System.out.println(key + "=" + value);
//
//}