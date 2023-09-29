package file_2_2;

import java.io.File;
import java.io.FileWriter;

public class Writterr {
public static void main(String[] args) throws Exception{
	
	File f = new File("Folder1","TEXTFILE.txt");
	
	if(!f.exists()) {
		f.createNewFile();
	}
	FileWriter w = new FileWriter(f);
	for (int i = 65; i <=90; i++) {
		w.write(i);
		w.write(" "); // space betwn charc
	}
	w.flush();
	w.close();
	
}
}
