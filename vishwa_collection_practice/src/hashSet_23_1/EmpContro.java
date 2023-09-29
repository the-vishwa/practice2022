package hashSet_23_1;

import java.util.HashSet;

public class EmpContro {
public static void main(String[] args) {
	
	HashSet<Employee> set = new HashSet<>();
	
	Employee e = new Employee(10, "vishwa", "rwl");
	Employee e1 = new Employee(10, "vishwa", "rwl");
	System.out.println(set.add(e));// true
	System.out.println(set.add(e));//false
	System.out.println(set.add(e1));//true
	
	System.out.println(e.hashCode());
	System.out.println(e1.hashCode());
	
	Employee e2=e;
	System.out.println(e2==e);
	
	System.out.println(e==e1);
	System.out.println(e.equals(e1));
	
	System.out.println(e.hashCode()==e1.hashCode());
	
	set.add(new Employee(10, "vishwa", "rwl"));
	set.add(new Employee(10, "vishwa", "rwl"));
	System.out.println(set);
	
}
}
