package in.com.Deserializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Teast_Seriaalizable {
	public static void main(String[] args) throws Exception  {
			String source="C:\\Users\\Benu\\Desktop\\IO Stream in\\Himanshu.txt";
			FileOutputStream in = new FileOutputStream (source);
			ObjectOutputStream out = new ObjectOutputStream(in);
			
			Marksheet m = new Marksheet();
			m.id = 1;
			m.name = "bhavna";
			m.java = 76;
			m.python = 78;
			m.html = 91;
			m.css = 74;
			m.javascript = 89;
			m.total = m.java + m.python + m.html +m.css + m.javascript;
			
			out.writeObject(m);
		 
			out.close();
			in.close();
			System.out.println("object Convert into bytsteeam successfully");
		}
} 

