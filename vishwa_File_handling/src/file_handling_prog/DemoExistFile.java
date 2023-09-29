package file_handling_prog;

import java.io.File;

public class DemoExistFile {
public static void main(String[] args) {
	File f = new File("rwl.txt");
	boolean b = f.exists();
	System.out.println(b);
}
}
