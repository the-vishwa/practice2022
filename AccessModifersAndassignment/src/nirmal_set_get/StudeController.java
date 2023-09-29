package nirmal_set_get;

public class StudeController {
	public static void main(String[] args) {

		Student2 student = new Student2("nirmal", "rajput", 12);
		String str = student.getStudentFName();//always give the return type to any method.....
		String s = student.getStudentlName();//always give the return type to any method.....
		int i = student.getStudentRollNumber();//always give the return type to any method.....

		System.out.println(str);
		System.out.println(s);
		System.out.println(i);
	}
}
