package in.com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArryListCollection {
	public static void main(String[] args) {
		ArrayList c1= new ArrayList();
		c1.add(123);
		c1.add(144);
		c1.add(546);
		System.out.println(c1);
			
	Iterator it = c1.iterator();
	System.out.println(it.hasNext());
	for (Object object : c1) {
		System.out.println(object);
	System.out.println(c1.contains(c1));
       }
	
		
	//}
//	while(it.hasNext()) {
	//System.out.println(it.next());

	}
			}


