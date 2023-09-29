package com.student.show.info;

import com.student.info.StudentInfo;

import com.student.info.Student;

public class ShowStudentinfo {

	public static void main(String[] args) {

		StudentInfo arr = new StudentInfo();
		Student[] studentaaray = arr.getStudentInfo();

		for (int i = 0; i < studentaaray.length; i++) {

			System.out.println(studentaaray[i].getFirstName());
			System.out.println(studentaaray[i].getLastName());
			System.out.println(studentaaray[i].getRollNumber());
			System.out.println(studentaaray[i].getDiv());

			System.out.println("--------------------------------");

		}

	}
}
