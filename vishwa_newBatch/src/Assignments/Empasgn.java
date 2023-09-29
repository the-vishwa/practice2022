package Assignments;

public class Empasgn {

	void getSalary(Employee[] e1) {

		for (int i = 0; i < e1.length; i++) {
			if (e1[i].getSalary() >= 5000.00) {
				// e1[i].setSalary(e1[i].getSalary() * (10 + 100 / 100));
		System.out.println(e1[i].getName());
	    System.out.println("increment=" + (e1[i].getSalary() + e1[i].getSalary() * 10 / 100));
			}
		}
	}
}
//int sum =0;
//for (int i = 0; i < e1.length; i++) {
//	
//	if (e1[i].getSalary() == e1[i].getSalary()) {
//		double c=(e1[i].getSalary()*10/100) + e1[i].getSalary(); 
//		System.out.println(c);
//	}
//}
//return sum;