package in.com.Collection;

import java.util.ArrayList;
import java.util.Collections;


public class CollectionShort {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		 marks.add(87);
		 marks.add(76);
		 marks.add(99);
		 marks.add(45);
		 
		 System.out.println(marks);
		 
		 Collections.sort(marks);
		 System.out.println(marks);     //iska use assending order me print hoga
		
	
		 
	}

}
