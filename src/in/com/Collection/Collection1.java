package in.com.Collection;

import java.util.ArrayList;

public class Collection1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(123);
		list.add(155);
		list.add("bhavna");
		list.add(156.0);
		System.out.println(list);
		
		ArrayList e= new ArrayList();
		e.add(145);
		e.add(768);
		e.add(453.00);
		e.add("pramila");
		System.out.println(e);
		
		list.addAll(e);
		System.out.println(list);
		
//		list.clear();
//		e.clear();
//		System.out.println(list);
//		System.out.println(e);
//		
//		
		System.out.println(list.contains(123));
		System.out.println(e.containsAll(e));
		
//		System.out.println(list.isEmpty());
//		list.remove(0);
//		System.out.println(list);
//		
		list.retainAll(list);
		System.out.println(list);
		
		list.size();
		System.out.println(list);
		
		list.addAll(0, list);
		System.out.println(list);
		
		
		
	}
}