package file_and_folder_30_1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListOutFileANDFolders {
	public static void main(String[] args) {
		File f= new File("RWL");	
		
		String[] str = f.list();
		int file =0;
		int  folder =0;
		for (String s : str) {
			File ff = new File("RWL\\"+s);
			System.out.println(ff);
			if(ff.isDirectory() ) {
				folder++;
			}else if(ff.isFile()) {
				file++;
			}
		}
		System.out.println("folder="+ folder);
		System.out.println("file="+ file);
		
		List<String> list = new ArrayList<>();
		Collections.sort(list);
		System.out.println(list);
	}
}
