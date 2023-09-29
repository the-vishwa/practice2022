package vishwa_11_10_Static;



public class Controller {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "abc";
		s.rollNo = 23;
		s.cellPhone =4545612121L;
		s.m1();
		s.m2();
		
	//  access static variable & method using class name
			Student.schoolName = "BKC mandir";
			Student.s1();
			Student.s2();
		
		
}
}