package in.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Photo_Input {
	public static void main(String[] args) throws IOException {
		FileInputStream sp = new FileInputStream("E:\\ra.jpg");
		FileOutputStream fp = new FileOutputStream("E");
		int ch = sp.read();
		while(ch!= -1) {
	   fp.write(ch);
	   ch = sp.read();
		}
		
		sp.close();
		fp.close();
		System.out.println("copy successful");
	}

}
