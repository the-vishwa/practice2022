package serializable_pro;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
//serialize
public class ObjConversion {
	public static void main(String[] args) throws Exception {
		Employee e = new Employee(2, "vishwa", "RWL");

		FileOutputStream file = new FileOutputStream("employee1.txt");
		ObjectOutputStream o = new ObjectOutputStream(file);
		o.writeObject(e);
		System.out.println("we r gonna convert object into the file formate");
	}
}
