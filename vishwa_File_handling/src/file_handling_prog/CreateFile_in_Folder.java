package file_handling_prog;

import java.io.File;
import java.io.IOException;

public class CreateFile_in_Folder {
	public static void main(String[] args) throws IOException {
		File f = new File("My_resume");
		f.mkdir();
		//File f1 =new File("My_resume"f,"vishwa.pdf");  this will also work 3rd constructor
		File f1 =new File(f,"vishwa.pdf");
		f1.createNewFile();
		
	}
}
