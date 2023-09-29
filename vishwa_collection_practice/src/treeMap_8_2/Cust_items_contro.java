package treeMap_8_2;

import java.util.ArrayList;
import java.util.List;

public class Cust_items_contro {
	public static void main(String[] args) {

		Cust_Items c = new Cust_Items();
		
		Customer c1 =new Customer(6,"vibhuti");
		List<Iteam> list1 =new ArrayList<>();
		list1.add(new Iteam(1, "Sugar", 38.50, 12));
		list1.add(new Iteam(2, "Washing Powder", 98.50, 2));
		list1.add(new Iteam(3, "oil", 185.0, 5));
		
		Customer c2 =new Customer(7,"anguri");
		List<Iteam> list2 =new ArrayList<>();
		list2.add(new Iteam(67, "Mobile", 15000, 1));
		list2.add(new Iteam(31, "oil", 185.0, 15));
		
		
		c.addCustomerDetails(c1, list1);
		c.addCustomerDetails(c2, list2);
		c.showCustDetails();
		
		
	}
}
