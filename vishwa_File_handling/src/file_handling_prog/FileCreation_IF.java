package file_handling_prog;

import java.io.File;
import java.io.IOException;

public class FileCreation_IF {
	public static void main(String[] args) throws IOException {
		File f = new File("rwl2.txt");
		boolean b = f.exists();
		System.out.println(b);

		if (!f.exists()) {
			f.createNewFile();
		}
		boolean b1 = f.exists();
		System.out.println(b1);
	}
}
