package linkedHashmap_4_2;

public class Studcontorll {
	public static void main(String[] args) {
//		Student s= new Student();
		StudentMethods ss = new StudentMethods();
		
		ss.addMethod(12, new Student(405, "mani"));
		ss.addMethod(13, new Student(406, "nirmal"));
		ss.update(12, new Student(405, "vishwa"));
		
		
		ss.getMethod(12);
		
//		ss.delete(12);
		
		System.out.println("__________");
		ss.printall();

		
		
		
//		HashMap<Integer, Student> map = new HashMap<>();
//		map.put(23, new Student(404, "vishwa"));
//		map.put(25, new Student(406, "nirmal"));
//		map.put(24, new Student(405, "mani"));

	}

}