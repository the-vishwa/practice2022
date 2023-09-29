package file_handling_prog;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		File f = new File("rwl.txt");
		f.createNewFile();
		

	}
}
