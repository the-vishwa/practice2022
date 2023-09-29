package file_handling_prog;

import java.io.File;

public class Assignm {
public static void main(String[] args) {
	File f =new File("Assign");
	f.mkdir();
	
	if(!f.exists()&&f.isDirectory()) {}
	String[] nmes = f.list();
	System.out.println(nmes.length);
	for (String str : nmes) {
		System.out.println(str);
	}
}
}
