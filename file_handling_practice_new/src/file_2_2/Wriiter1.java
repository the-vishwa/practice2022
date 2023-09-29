package file_2_2;

import java.io.File;
import java.io.FileWriter;

public class Wriiter1 {
public static void main(String[] args) throws Exception{
	
	File f = new File("Folder1","CHAR1.txt");
	char[] ch = {'a','b','c','d'};
	FileWriter w = new FileWriter(f,true);
	w.write(ch);
	w.write(" ");
	w.write("right way learning");
	w.flush();
	w.close();
	
}
}
