package file_1_2;

import java.io.File;
import java.io.FileWriter;

public class ApendOpt {
public static void main(String[] args) throws Exception{
	
	File f22 = new File("Folder1","DATA.txt");
	FileWriter w11 = new FileWriter(f22,true);// append
	w11.write(" A B C D E F G  H I J K");
	w11.flush();
	w11.close();
	
	
}
}
