package com.student.info;

public class StudentInfo {

	public Student[] getStudentInfo() {

		Student[] stud = new Student[5];

		stud[0] = new Student("nirmal", "rajput", 12, 'a');
		stud[1] = new Student("kuldip", "rajput", 13, 'b');
		stud[2] = new Student("prashant", "rajput", 14, 'c');
		stud[3] = new Student("indra", "rajput", 15, 'd');
		stud[4] = new Student("vishva", "rajput", 16, 'e');
		
		return stud;

	}

}
