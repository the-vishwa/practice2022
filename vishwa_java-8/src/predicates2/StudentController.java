package predicates2;

import java.util.function.Predicate;

public class StudentController {
	
	public static void main(String[] args) {
		
		Student s = new Student("A", 75.00);
		Student s1 = new Student("B", 65.00);
		
		Predicate<Student> predicate =(p)-> {if(p.getPertg() >70.40) {return true;}else{return false;}};
		// turnory opt
		Predicate<Student> predicate1 = (p) -> p.getPertg() > 70.40 ? true : false;
		System.out.println(predicate1.test(s1));
	}

}
