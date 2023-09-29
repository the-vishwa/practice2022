package collection_object_proccesssing;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
	public static void main(String[] args) {
		StudentOperationOnArraylist so = new StudentOperationOnArraylist();
		List<Student> list = new ArrayList<>();
		so.operationMethod(list, new Student(1, "vishwa", null));
		so.operationMethod(list, new Student(2, "nirmal", 40.65));
		so.operationMethod(list, new Student(3, "kuldip", 50.65));
		so.operationMethod(list, new Student(4, "premjit", 60.65));
		so.operationMethod(list, new Student(5, "darpan", 70.65));
		so.operationMethod(list, new Student(6, "sachin sirji", 90.65));

		// so.given(list);

		for (Student student : list) {
			System.out.println(student);
		}
	}
}

// error----The method operationMethod(ArrayList<Student>, Student) in the type StudentOperationOnArraylist is not applicable for the arguments 
//(List<Student>, Student) 

//	so.operationMethod((ArrayList<Student>) list, new Student(1, "vishwa", 35.65));       // type cast

//	al.add(new Student(1,"vishwa",35.65));
//	al.add(new Student(2,"nirmal",40.65));
//	al.add(new Student(3,"kuldip",50.65));
//	al.add(new Student(4,"premjit",60.65));
//	al.add(new Student(5,"darpan",70.65));
//	al.add(new Student(6,"sachin sirji",80.65));
