package in.com.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Read_WriteFile {
	public static void main(String[] args) {
		File f = new File("rays.java");
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
		
		try {
			FileWriter w = new FileWriter("rays.java");
			w.write("save the life");
			w.close();
		} catch ( IOException e) {
			System.out.println("String Erros");
			e.printStackTrace();
		}
		
	}

}
