package file_handling_prog;

import java.io.File;
import java.io.IOException;

public class ShowFileobject_type {
	
	
	static void showType(File f) {
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}
	public static void main(String[] args) throws IOException {

		File f1 = new File("abc.txt");
		if (!f1.exists()) {
			f1.createNewFile();
		}
		showType(f1);
		File f2 = new File("Myfolder");
		f2.mkdir();
		showType(f2);

	}
}
