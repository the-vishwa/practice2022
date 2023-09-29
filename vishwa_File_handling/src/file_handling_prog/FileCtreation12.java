package file_handling_prog;

import java.io.File;
import java.io.IOException;

public class FileCtreation12 {
public static void main(String[] args) throws IOException {
	File f = new File("rwl123.txt");
	boolean b = f.exists();
	System.out.println(b);
	
	if(b==false)  // OR  if(!b)
		f.createNewFile();
}
}
