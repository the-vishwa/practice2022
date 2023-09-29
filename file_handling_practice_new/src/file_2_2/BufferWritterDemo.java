package file_2_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferWritterDemo {
public static void main(String[] args) throws Exception{
	
	File f = new File("Folder1\\NEWFILEWR.txt");
	FileWriter w = new FileWriter(f);
	BufferedWriter bw = new BufferedWriter(w);
	for (int i = 65; i <= 90; i++) {
		bw.write(i);
	}
	bw.flush();
	bw.close();
	
	
	
	
	
	
}
}
