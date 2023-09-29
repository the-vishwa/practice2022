package file_handling_prog;

import java.io.File;
import java.io.IOException;

public class Assignnnn3 {
public static void main(String[] args) throws IOException {
	File f =new File("Assignnn3");
	f.mkdir();
	
	File f1 =new File(f,"Assignnn1");
	File f2 =new File(f,"Assignnn2");
	f1.mkdir();
	f2.mkdir();
	
	File ff =new File(f,"a.txt1");
	File ff1 =new File(f,"a.txt2");
	File ff2 =new File(f,"a.txt3");
	
	ff.createNewFile();
	ff1.createNewFile();
	ff2.createNewFile();
	
	File f4 = new File (f1,"a.txt1");
	File f5 = new File (f1,"a.txt2");
	File f6 = new File (f1,"a.txt3");
	
	f4.createNewFile();
	f5.createNewFile();
	f6.createNewFile();
	
	
	
	
}
}
