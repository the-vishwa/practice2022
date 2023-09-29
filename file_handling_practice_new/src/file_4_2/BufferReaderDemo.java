package file_4_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReaderDemo {
public static void main(String[] args) throws Exception{
	
	File f = new File("Folder1\\NEWFILEWR.txt");
	FileReader r = new FileReader(f);
	BufferedReader br = new BufferedReader(r);
	
	String ii = br.readLine();
	while( ii !=null ) {
		System.out.println(ii);
		ii=br.readLine();
	}
	br.close();
	
	
	
}
}
