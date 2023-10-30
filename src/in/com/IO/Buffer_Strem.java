package in.com.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Buffer_Strem {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the text");
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader is= new BufferedReader(reader);
		FileWriter write = new FileWriter("C:\\Users\\Benu\\Desktop\\IO Stream in\\sonali");
		PrintWriter p = new PrintWriter(write);
		String line = is.readLine();
		
		while(!(line.equals("bye"))) {
		p.println(line);
		line = is.readLine();
		}
		System.out.println("your compiler is closed");
		is.close();
		p.close();
		write.close();
		reader.close();
	}

}
