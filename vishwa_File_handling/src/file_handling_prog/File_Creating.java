package file_handling_prog;

import java.io.File;
import java.io.IOException;

public class File_Creating {
	public static void main(String[] args) throws IOException {
		File f = new File("rwl_sample.pdf");
		f.createNewFile();

	}

}
