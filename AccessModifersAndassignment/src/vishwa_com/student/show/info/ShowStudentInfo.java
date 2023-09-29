package vishwa_com.student.show.info;

import vishwa_com.student.info.Student;
import vishwa_com.student.info.StudentInfo;

public class ShowStudentInfo {

	public static void main(String[] args) {

		StudentInfo sti = new StudentInfo();

		Student[] studentArray = sti.getStudentInfo();

		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].getStudentName());
			System.out.println(studentArray[i].getRollNumber());
			System.out.println(studentArray[i].getSchoolName());

		}

	}

}
