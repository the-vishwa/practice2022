package TreeSetExample;

import java.util.TreeSet;

public class EmpController {
public static void main(String[] args) {
TreeSet<Employee> tree = new TreeSet<>();
	tree.add(new Employee(12, "A"));//1
	tree.add(new Employee(21, "B"));//2
	tree.add(new Employee(30, "C"));//3
	tree.add(new Employee(14, "A"));//4
	tree.add(new Employee(15, "D"));//5
	tree.add(new Employee(15, "B"));//6
	
	
//tree.add(new Employee(12, "D"));// 1
//tree.add(new Employee(21, "B"));// 2
//tree.add(new Employee(30, "C"));// 3
//tree.add(new Employee(14, "A"));// 4
//tree.add(new Employee(15, "E"));// 5
//tree.add(new Employee(15, "F"));// 6
//tree.add(new Employee(15, "F"));// 7
//	
	for(Employee ee : tree) {
		System.out.println(ee);
	}
	
	 
}
}
