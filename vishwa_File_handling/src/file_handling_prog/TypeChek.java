package file_handling_prog;

import java.io.File;
import java.io.IOException;

public class TypeChek {

	static void type(File f) {
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}

	public static void main(String[] args) throws IOException {
		File f1 = new File("abc1122.txt");
		f1.createNewFile();
		type(f1);
		
		
		File f2 = new File("My_new_folder");
		f2.mkdir();
		type(f2);
	}
}
