package file_handling_prog;

import java.io.File;

public class List_name_OfFiles_folder {
public static void main(String[] args) {
	File f= new File("My_resume");
	if(f.exists()&& f.isDirectory()) {
		String[] names = f.list();
		System.out.println(names.length);
		
		for (String string : names) {
			System.out.println(string);
		}
		
	}
	
}
}
