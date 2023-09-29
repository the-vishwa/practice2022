package serializable_pro;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudContro {
public static void main(String[] args) throws Exception {
	Student st = new Student();
	st.firstName="vishwa";
	st.lastName="Rajput";
	st.rollNum=10;
	
	FileOutputStream file = new FileOutputStream("student.txt");
	ObjectOutputStream o = new ObjectOutputStream(file);
	o.writeObject(st);
	
	
	
	FileInputStream file1 = new FileInputStream("student.txt");
	ObjectInputStream o1 = new ObjectInputStream(file1);
	 Student t = (Student)o1.readObject();
	 System.out.println(t.firstName);
	 System.out.println(t.lastName);
	 System.out.println(t.rollNum);
	
	
	
}
}
