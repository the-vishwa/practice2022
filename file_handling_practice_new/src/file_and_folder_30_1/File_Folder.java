package file_and_folder_30_1;

import java.io.File;

public class File_Folder {
	public static void main(String[] args) {
		File f= new File("test.pdf");
		//System.out.println(f.exists());
		try {
			f.createNewFile();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(f.exists());
		
		
		
		
		
		
		
		
		
	}
}
