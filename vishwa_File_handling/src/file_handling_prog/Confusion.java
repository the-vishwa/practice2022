package file_handling_prog;

import java.io.File;
import java.io.IOException;

public class Confusion {
public static void main(String[] args) throws IOException {
	
	File f= new File("shriRam.txt");
	System.out.println(f.isDirectory()); //here f.isFile();
	 f.createNewFile();
	
	File f1= new File("Folder1");
	System.out.println(f1.isFile()); //here f1.isDirectory();
	f1.mkdir();
}
}
