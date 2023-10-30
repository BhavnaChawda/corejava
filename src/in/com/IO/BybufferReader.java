package in.com.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BybufferReader {
	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("C:\\Users\\Benu\\Desktop\\IO Stream in\\Hello.txt");
		BufferedReader  b  = new BufferedReader(r);
		
		String line = b.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line = b.readLine();
		}
		
		b.close();
		r.close();
	}

}
