package in.com.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test_Io_Strem {
	public static void main(String[] args) throws IOException {
		FileOutputStream in = new FileOutputStream ("C:\\Users\\Benu\\Desktop\\IO Stream in\\obj.txt");
		ObjectOutputStream out = new ObjectOutputStream(in);
		
		Marksheeti m = new Marksheeti();
		m.id = 1;
		m.name = "bhavna";
		m.java = 76;
		m.python = 78;
		m.html = 91;
		m.css = 74;
		m.javascript = 89;
		m.total = m.java + m.python + m.html +m.css + m.javascript;
		
		out.writeObject(m);
		in.close();
		out.close();
		System.out.println("object Convert into bytsteeam successfully");
		
		
	}

}
