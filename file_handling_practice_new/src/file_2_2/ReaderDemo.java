package file_2_2;

import java.io.File;
import java.io.FileReader;

public class ReaderDemo {
	public static void main(String[] args) throws Exception {

		File f = new File("Folder1\\TEXTFILE.txt");
		FileReader r = new FileReader(f); //asciee value read kart char nahi
		
		
		
//		int i=r.read();
//		while(i !=-1) {
//		char c =(char)i;
//		System.out.print(c);
//			i=r.read();
//		}
//		r.close();
//---------------------------------------------------------------------------------------------
		// here problem is we r readding char by chr
		// solution
		
		 long charSize =f.length();
		char[] ch = new char[(char)charSize];
		r.read(ch);
		for (int j = 0; j < ch.length; j++) {
		System.out.print(ch[j]);
		}
		r.close();
		
	}
}
