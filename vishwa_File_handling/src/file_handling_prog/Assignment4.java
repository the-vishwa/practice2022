package file_handling_prog;

import java.io.FileWriter;
import java.io.IOException;

public class Assignment4 {
	// print small and capital alphabets in one file
	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("D:\\ALPHABETS 1\\alpha1.txt");

		for (int i = 97; i <= 122; i++) {
			f.write(i);
			f.flush();
			f.write("\n");

		}
		f.write("\n");
		f.write("\n");

		for (int i = 65; i <= 90; i++) {
			f.write(i);
			f.flush();
			f.write("\n");

		}

	}
}
