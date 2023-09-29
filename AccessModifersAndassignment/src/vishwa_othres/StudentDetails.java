package vishwa_othres;

public class StudentDetails {

	public static void main(String[] args) {

//		String[] studentName = { "vishwa", "nirmal", "kuldip", "premjit" };
//		String  [] subjName = { "english", "history", "marathi", "sanskrit" };
//		int[] marks = { 90, 80, 70, 60 };

		// or
		
		String  studentName [] = { "vishwa", "nirmal", "kuldip", "premjit" };
		String  subjName[]  = { "english", "history", "marathi", "sanskrit" };
		 int marks[]  = { 90, 80, 70, 60 };
		
		for (int i = 0; i < studentName.length; i++) {
			System.out.println(studentName[i]);
			System.out.println();

		for (int j = 0; j < subjName.length; j++) {
				System.out.println(subjName[j]);
		}
//
//			for (int k = 0; k < marks.length; k++) {
//
//				System.out.println(marks[k]);
//			}
//			System.out.println("________");
		}
	}
}
//seperate marks assingn