package Assignments;

public class Emp {
	public static void main(String[] args) {

		Employee[] e = new Employee[3];
		//1st way
		//Employee e3= new Employee();
		//e3.setName("vishwa");
		//System.out.println(e3 instanceof Employee);
		
		e[0] = new Employee("vishwa", 15000.46);
		System.out.println(e[0] instanceof Employee);
		
		//e[0].setName("vinayak"); or
		e[1] = new Employee("nirmal", 7000.40);
		e[2] = new Employee("kuldip", 9000.20);
		// OR way to create object
		//Employee[] e9 = {new Employee("vishwa", 15000.46),new Employee("nirmal", 7000.40)};
		
		// 2nd way
//		Employee e3= new Employee("vishwa", 15000.46);
//		e[0]=e3;
//		Employee e4= new Employee("vishwa", 15000.46);
//		e[1]=e4;
//		Employee e5= new Employee("vishwa", 15000.46);
//		e[2]=e5;
		//Employee[] e1= {e3,e4,e5};
		
		Employee[] e1= {e[0],e[1],e[2]};
		Empasgn ee =new Empasgn();
		 ee.getSalary(e1);
	
		 
		 
		 
		 
		 
		}
		
	}

