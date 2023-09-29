package nirmal_practice_import;

import nirmal_practice_of_import.Student1;
import nirmal_practice_of_import.Student1Info;

public class ShowEployeeDetail {

	public static void main(String[] args) {

		Student1Info s = new Student1Info();

		Student1[] obj = s.getstudents1info();

		for (int i = 0; i < obj.length; i++) {
           
			System.out.println(obj[i].getStudentFName());
			System.out.println(obj[i].getStudentLName());
			System.out.println(obj[i].getStudentRollNum());
			System.out.println("--------------------------------");

		}
	}
}
