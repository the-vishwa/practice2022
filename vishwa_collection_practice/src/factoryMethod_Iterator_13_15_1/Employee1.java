package factoryMethod_Iterator_13_15_1;

public class Employee1 {
private String name;
private double salary;
public Employee1() {}
public Employee1(String name, double salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee1 [name=" + name + ", salary=" + salary + "]";
}
}
