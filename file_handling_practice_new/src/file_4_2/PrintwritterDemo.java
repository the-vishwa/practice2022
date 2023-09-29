package file_4_2;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintwritterDemo {

	public static void main(String[] args) throws Exception{
		
		File f = new File("Folder1\\NEWFILEWR.txt");
		FileWriter w = new FileWriter(f,true);
		
		PrintWriter p  = new PrintWriter(w);
		p.write("Vishwajeet singh");
		p.flush();
		p.close();
		
		
	}
	
}
