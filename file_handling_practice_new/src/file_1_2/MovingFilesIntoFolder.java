package file_1_2;

import java.io.File;

public class MovingFilesIntoFolder {
	
public static void main(String[] args) throws Exception{
	
	File f = new File("RWL");
	
	File f1 = new File(f,"vinayak.pdf");
   f1.createNewFile();
	
   File f2 = new File(f,"shshs.pdf");
  System.out.println(f2);
   
   
}
}
