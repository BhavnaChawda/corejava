package in.com.Collection;

import java.util.LinkedList;
import java.util.List;

public class Collection2 {
	public static void main(String[] args) {
		List a = new LinkedList();
		a.add(123);
		a.add(657);
		a.add(987);
		
		
	   a.add(0, 178);
		System.out.println(a);
		
		
		System.out.println(a.get(1));
		
		a.remove(2);
		System.out.println(a);
		
	  a.set(1, 444);
		System.out.println(a);
		
	
		System.out.println(a.get(3));
		
		
		System.out.println(a.lastIndexOf(123));
		
		
	}

}
