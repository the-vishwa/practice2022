package com.student.info;

public class Student {

	private String FirstName;
	private String LastName;
	private int RollNumber;
	private char Div;
	
	

	public Student(String firstName, String lastName, int rollNumber, char div) {

		FirstName = firstName;
		LastName = lastName;
		RollNumber = rollNumber;
		Div = div;

	}
	

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}

	public char getDiv() {
		return Div;
	}

	public void setDiv(char div) {
		Div = div;
	}

}
