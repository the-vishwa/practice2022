package vishwa_othres;

public class Scontrollr {

	public static void main(String[] args) {

		Student[] ss = new Student[4]; 
		ss[0] = new Student("vishwa", "english", 90);
		ss[1] = new Student("nirmal", "hindi", 95);
		ss[2] = new Student("kuldip", "marathi", 90);
		ss[3] = new Student("premjit", "history", 80);

		for (int i = 0; i < ss.length; i++) {

			System.out.println(ss[i].studentName);
			System.out.println(ss[i].subjectName);
			System.out.println(ss[i].marks);
			System.out.println("______________");
		}
	}
}