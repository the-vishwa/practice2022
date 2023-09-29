package treeMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import tree_map_demo.Customer;

public class CustItems {
	private List<Items> list;
	private TreeMap<Customer, List<Items>> map;

	public CustItems() {
		this.map = new TreeMap<>();
		this.list = new ArrayList<>();
		list.add(new Items(1010, "perfumes", 100.50, 2));
		list.add(new Items(1011, "soaps", 10.50, 5));
		list.add(new Items(1012, "clinzr", 300.40, 3));
		list.add(new Items(1013, "hairoil", 50.70, 2));

		this.map.put(new Customer(1, "vishwa"), list);
		this.map.put(new Customer(2, "nirmal"), list);
		this.map.put(new Customer(3, "kuldip"), list);
		this.map.put(new Customer(4, "darpan"), list);
		this.map.put(new Customer(5, "sonali"), list);

//		Set<Entry<Customer, List<Items>>> set = map.entrySet();
//		for (Entry<Customer, List<Items>> entry : set) {
//			System.out.println(entry);
//		}
		Set<Customer> st = map.keySet();
		for (Customer ct : st) {
			List<Items> list = this.map.get(ct);
			System.out.println("                   "+ct);
			for (Items itm : list) {
				System.out.println(itm);
			}

		}

	}
}






//	void addCustometDetails(Customer cust, List<Items> list) {
//		this.map.put(cust, list);
//	}