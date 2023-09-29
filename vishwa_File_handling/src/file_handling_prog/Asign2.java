package file_handling_prog;

import java.io.File;

public class Asign2 {
public static void main(String[] args) {
	File f=new File("Ramayan");
	f.mkdir();
	
	
	
	File f1 = new File(f,"mahabharat");
	f1.mkdir();
	
	File f2 = new File(f,"Shrimad Bhagwat Gita");
	File f3 = new File(f,"hanuman Chalisa");
	f2.mkdir();
	f3.mkdir();
	
	
	
	
}
}
