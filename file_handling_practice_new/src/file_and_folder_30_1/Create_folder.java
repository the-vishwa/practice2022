package file_and_folder_30_1;

import java.io.File;

public class Create_folder {
	
	public static void type(File f) {
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}
	
public static void main(String[] args) throws Exception{
	
	File f1= new File("vishwa1.pdf");
	f1.createNewFile();
	System.out.println(f1.isFile()); // file ahe ki nahi
	
	File f= new File("RWL");	
	f.mkdir(); // for creating folder
	System.out.println(f.isDirectory());// folder  ahe ki nahi

	
	// created folder insertin file inside that filder,
	File f2= new File(f,"swami.pdf");
	f2.createNewFile();
	
	File f3= new File(f,"vishwa1.pdf");
	f3.createNewFile();
	type(f3);
	
	File f4= new File("RWL","vishwa3.pdf");
	f4.createNewFile();
	
	File f5= new File("RIGHTWAY");
	f5.mkdir();
	type(f5);
	
	
	
	
}
}
