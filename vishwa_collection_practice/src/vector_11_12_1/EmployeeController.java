package vector_11_12_1;

import java.util.ArrayList;
import java.util.Iterator;
// Crude operations   as remove search update
public class EmployeeController {
	ArrayList<Employee> list;
	
	public EmployeeController(){
		this.list=new ArrayList<>();
	}
	
	
	Employee empDetails(ArrayList<Employee> list,Integer id){
		for (Employee e : list) {
			if(e.getId().equals(id)) {
				return e;
			}
		}
		return null;
	}
	Employee withIterator(Integer id,ArrayList<Employee> e){
		Iterator<Employee>  itr=  e.iterator();
		while (itr.hasNext()) {
			Employee p = itr.next();
			if (p.getId().equals(id)) {
				return p;
			}
		}
		return null;
	}
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<>();
		e.add(new Employee(12,"vishwa","RWL"));
		e.add(new Employee(13,"prem","infosys"));
		e.add(new Employee(14,"kuldip","TCS"));
		e.add(new Employee(15,"nimal","hexaware"));
		e.add(new Employee(16,"mani","Mdox"));
		
		EmployeeController ee = new EmployeeController();
//		System.out.println(ee.empDetails(e,12));
		System.out.println(ee.withIterator(16,e));
		
	}
}
