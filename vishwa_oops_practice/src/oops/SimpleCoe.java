package oops;

class Employee {
	int id;
	String name;
	int salary;

	public void printdetails() {
		System.out.println("my id is " + id);
		System.out.println("my name is " + name);
	}
	
	int getSalary() {
		return salary;
	}

}

public class SimpleCoe {
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee();
		e.id=12;
		e.name="vishwa";
		e.salary=16;
		e1.id=13;
		e1.name="nirmal";
		e.printdetails();
		e1.printdetails();
		
		int my = e.getSalary();
		System.out.println("salary="+my);
		
	}
}
