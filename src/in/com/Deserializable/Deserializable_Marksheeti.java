package in.com.Deserializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializable_Marksheeti {
	public static void main(String[] args) throws Exception {
		String source="C:\\Users\\Benu\\Desktop\\IO Stream in\\Himanshu.txt";
		FileInputStream in = new FileInputStream(source);
		ObjectInputStream out = new ObjectInputStream(in);
	Marksheet m = (Marksheet) out.readObject();
		
	System.out.println("id="+m.id);
	System.out.println("name="+m.name);
	System.out.println("java="+m.java);
	System.out.println("html="+m.html);
	System.out.println("css="+m.css);
    System.out.println("python="+m.python);	   
    System.out.println("javascript="+m.javascript);	    
    System.out.println("total="+m.total);
//		out.close();in.close();
//		System.out.println("Deserialization completed");
//	
	}

}
