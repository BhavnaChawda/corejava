package in.com.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Io_program {
	public static void main(String[] args) throws IOException {
		System.out.println("enter the text");
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader is= new BufferedReader(reader);
		FileWriter write = new FileWriter("C:\\Users\\Benu\\Desktop\\IO Stream in\\bhavna.txt");
		PrintWriter pw = new PrintWriter (write);
		String line = is.readLine();
		while(!(line.equals("bye"))) {
			pw.println(line);
			line=is.readLine();
		}
		System.out.println("done");
		pw.close();
		is.close();
		reader.close();
		write.close();
		
				
		
	}

	}


