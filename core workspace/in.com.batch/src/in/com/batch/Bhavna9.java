package in.com.batch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bhavna9 {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String str=sdf.format(date);
		System.out.println(str);
				
	}

}
