package Treeset_25_1;

import java.util.TreeSet;

public class EmpContro {

	public static void main(String[] args) {
		TreeSet<Employee> tree = new TreeSet<>();
		tree.add(new Employee(12, "nirmal"));
		tree.add(new Employee(12, "birmal"));
		tree.add(new Employee(11, "vishwajitsinh"));
		tree.add(new Employee(10, "vinayak"));
		tree.add(new Employee(12, "mani"));
		tree.add(new Employee(14, "ani"));
		tree.add(new Employee(13, "vinayak"));
		
	for (Employee e : tree) {
		System.out.println(e);
	}
	}
	
}







//tree.add(new Employee(12, "cfff"));
//tree.add(new Employee(11, "gffffffffffffff"));
//tree.add(new Employee(10, "affffff"));
//tree.add(new Employee(12, "cfff"));
//tree.add(new Employee(13, "bfffffffffff"));
//tree.add(new Employee(15, "accc"));



