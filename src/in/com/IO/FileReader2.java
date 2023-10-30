package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("C:\\Users\\Benu\\Desktop\\IO Stream in\\thought.txt");
		
		int a = r.read();
		while(a!=-1) {
			System.out.print((char)a);
			a=r.read();
		}
		r.close();
	}

}
