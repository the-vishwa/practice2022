package file_handling_prog;

import java.io.File;
import java.io.IOException;

public class CreateFile_inFolderDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("My_CV");
		f.mkdir();
		File f1 =new File(f,"vishwa1.pdf");
		if(!f1.exists()) {
			f1.createNewFile();
		}
		
	}
}
