package file_and_folder_30_1;

import java.io.File;

public class DeleteMethod {
public static void main(String[] args) throws Exception {
	
	File f1= new File("vishwa2.pdf");
	System.out.println(f1.exists());
	
	File f2= new File("RRWWLL.text");
	System.out.println(f2.exists());
	
	if (f2.exists()) {
		f2.createNewFile();
	} else {
		System.out.println("file is not exist");
	}
	System.out.println("___________________________________");
	
	File ff= new File("RWL","swami.pdf");
// if not exist the it will create n if file is exist then it wil delete	
	if (!ff.exists()) {
		ff.createNewFile();
		System.out.println("file created");
	} else {
		ff.delete();
		System.out.println("file deleted");
	}
	
//	File fff= new File("swami.pdf");
//	fff.delete();
	
	
}
}
