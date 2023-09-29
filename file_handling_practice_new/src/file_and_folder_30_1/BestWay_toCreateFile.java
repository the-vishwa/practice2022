package file_and_folder_30_1;

import java.io.File;

public class BestWay_toCreateFile {
public static void main(String[] args) throws Exception{
	
	File f= new File("vishwa.pdf");
	
	if(!f.exists()) {
	f.createNewFile();
	System.out.println("file succescfully created");
	}else {
		System.out.println("file is already exist");
	}
	
	File f1= new File("test11.pdf");
	boolean b = f1.exists();
	if(b==false) { // or (!b)
		f1.createNewFile();
	
	}	
}
}
