package file_1_2;

import java.io.File;
import java.io.FileWriter;

public class FileWrrrite {
public static void main(String[] args)throws Exception {
	File f2 = new File("Folder1","DATA.txt");
	FileWriter w1 = new FileWriter(f2);
	w1.write("vishwaRajput");
	w1.flush();
	w1.close();
	
	//--------------------here override date first will remove and insert new one--------------------------
	
	File f22 = new File("Folder1","DATA.txt");
	FileWriter w11 = new FileWriter(f22);
	w11.write("Stringformate");
	w11.write("djskfljdkfljkflsdjklfjklfjkdlsjfkdslfjdskfldsjfkdslfjds");
	w11.flush();
	w11.close();
	
	//-----------------------------------------------------------------------
	
	File f222 = new File("Folder1","ALL.txt");
	FileWriter w112 = new FileWriter(f222);
	w112.write(66);
	//w112.flush();
	//w112.close();
	
	for (int i = 65; i <= 90; i++) {
		w112.write(i);
	}
	w112.flush();
	w112.close();
	
	
	
	
	// a to z  print
	File f2222 = new File("Folder1","ALL.txt");
	FileWriter w1122 = new FileWriter(f2222);
	System.out.println("-----------------------");
	for (int i = 65; i <=90; i++) {
		w1122.write(i); // aftr conacate space it prints nums.
		w1122.write("\n"); // for next line
	}
	w1122.flush();
	w1122.close();
	
	
	
	
	
	
}
}
