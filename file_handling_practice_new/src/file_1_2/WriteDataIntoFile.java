package file_1_2;

import java.io.File;
import java.io.FileWriter;

public class WriteDataIntoFile {
public static void main(String[] args) throws Exception{
	
	File f = new File("Folder1");
	f.mkdir();
	//--------------------------------------------------------------
	File f1 = new File("file.txt");
	f1.createNewFile();
	//-----------------------------------------------------------
	FileWriter w = new FileWriter(f1);
	w.write("vijayi vishwati tiranga pyara");
	w.flush();
	w.close();
	
	//---------here new file automatically create( if folder is exist then & then new file will be created )-----------
	File f2 = new File("Folder1","tiranga.txt");
	FileWriter w1 = new FileWriter(f2);
	w1.write("zenda ucha rahe hamara");
	w1.flush();
	w1.close();
	
	//-----The system cannot find the path specified--exception----folder is not exist-----------------------------
	
//	File f3 = new File("Folder2","vijay.txt");
//	FileWriter w11 = new FileWriter(f3);
//	w11.write("dinanath chouhan");
//	w11.flush();
//	w11.close();
	
//--------------------------------------------------------------------------------------------------------------	
	File f4 = new File("E:\\New folder\\data_recovered\\file_handling_practice_new\\Folder1\\","XYZ.txt");
	FileWriter w111 = new FileWriter(f4);
	w111.write("kdlsjfksljdlj ");
	w111.flush();
	w111.close();
	
	
	
}
}
