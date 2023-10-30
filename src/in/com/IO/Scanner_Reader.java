package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scanner_Reader {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\Benu\\Desktop\\IO Stream in\\bhavna.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		file.close();
	}

}
