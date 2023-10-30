package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws IOException  {
		FileReader f = new FileReader("C:\\Users\\Benu\\Desktop\\IO Stream in\\Hello.txt");
		int reader = f.read();
		while (reader!=-1) {
			System.out.print( (char)reader);
			reader = f.read();
		}
		
		f.close();
		
	}

}
