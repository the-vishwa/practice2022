package collection_object_proccesssing;

import java.util.List;

public class StudentOperationOnArraylist {
	void operationMethod(List<Student> list, Student s) {
		if (s.getRollNumber() != null && s.getPercentage() !=null &&s.getName() !=null) {
		list.add(s); // in this list student all objects are passed 
		 }
	}
	
//	public  Boolean isValidStudentObject(Student s) {
//		if(s.getRollNumber()!=null && s.getPercentage()!=null) {
//			return true;
//		}
//		return false;
//	}
	
	
	
	
	
	
	
	
	
	
	// OR
//	void given(List<Student> list) {
//		operationMethod(list,new Student(1, "vishwa", 35.65));
//		operationMethod(list,new Student(2,"nirmal",40.65));
//		operationMethod(list,new Student(3,"kuldip",50.65));
//		operationMethod(list,new Student(4,null,60.65));
//		operationMethod(list,new Student(5,"darpan",70.65));
//		operationMethod(list,new Student(6,"sachin sirji",90.65));
//		
//	}
	
	
}
