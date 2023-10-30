package in.com.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector v  = new Vector();
	
	v.add(87);
	v.add(88);
	v.add(98);
	v.add(33);
	v.add("bhavna");
	
	
	System.out.println(v);
	
	Enumeration e = v.elements();   
	
	
	v.add("sonali");
	v.add("pramila");
	v.add(69);
	
	
  while (e.hasMoreElements()) {
	  System.out.println(e.nextElement());
	
}
	
}
}
