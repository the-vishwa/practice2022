package vishwa_assignAnd_Stak_Heap_22_12;

class Student {
	String name;
	Integer rollNuber;

	public Student(String name, Integer rollNuber) {
		this.name = name;
		this.rollNuber = rollNuber;
	}

	public int hashCode() {

		return this.rollNuber;
	}
	
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;

         	if (this.rollNuber.equals(s1.rollNuber)) {      //  OR

		//if (this.rollNuber == s1.rollNuber) {

			return true;
		}

		return false;
	}
}

public class StringAndStudentComp {
	public static void main(String[] args) {
		Student s1 = new Student("vijaybhaskar", 101);
		Student s2 = new Student("vijaybhaskar", 101);

		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());

		
		
		
		
		
	
		
		
		
		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s1);

//	String str = "abc";
//	String str1=new String ("lmn");
//	
//
//	
//	System.out.println(str.equals(str1));
//	
//	System.out.println(str.hashCode() == str1.hashCode());
//		

	}
}











//public boolean equals(Object obj) {
// Student s1 = (Student) obj;

//		if (this.name.equals(s1.name) && this.rollNuber.equals(s1.rollNuber)) {
//			return true;
//			if (this.rollNuber.equals(s1.rollNuber) && this.rollNuber.equals(s1.rollNuber)) {
//				return true;