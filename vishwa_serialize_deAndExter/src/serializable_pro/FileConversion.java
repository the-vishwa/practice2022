package serializable_pro;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
// de serialize
public class FileConversion {
	public static void main(String[] args) throws Exception {
		System.out.println( "😇 And here we have converted file into the object formate 😇");
		FileInputStream file = new FileInputStream("employee1.txt");
		ObjectInputStream o = new ObjectInputStream(file);
		// Employee e = (Employee)
		o.readObject();
		// System.out.println(e);
		

	}
}
