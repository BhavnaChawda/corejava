package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_4 {
	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("C:\\Users\\Benu\\Desktop\\IO Stream in\\thought.txt");
		int reader = r.read();
		while(reader!= -1) {
			System.out.print((char)reader);
			reader = r.read();
		}
		r.close();
	
	}

}
