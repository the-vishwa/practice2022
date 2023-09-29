package vvvv;

public class Employee {
	
	int a;
	String name;
	
public Employee(int a, String name) {
		super();
		this.a = a;
		this.name = name;
	}
@Override
public int hashCode() {
	return this.a+this.a; //Cannot invoke hashCode() on the primitive type int
}
@Override
public boolean equals(Object obj) {
	Employee ee = (Employee) obj;
	if (this.a==ee.a  &&  this.name==ee.name) {
		return true;
	}
	return false;
}


public static void main(String[] args) {
	
	Employee e = new Employee(10,"vv");
	Employee e1 = new Employee(20,"vv");
	
	System.out.println(e.hashCode());
	
	System.out.println(e.equals(e1));
}
}
