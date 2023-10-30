package in.com.IO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinterWriter {
	public static void main(String[] args) throws IOException {
	FileWriter write = new FileWriter("C:\\Users\\Benu\\Desktop\\IO Stream in\\bykeyword.txt");
	PrintWriter bhavna = new PrintWriter(write);
	bhavna.println("hello everyoun");
	bhavna.println("how are you");
	bhavna.println("what are you doing");
	System.out.println("data write successfully");
	write.close();
	bhavna.close();
	}

}
