package in.com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

import in.com.LoopsProgram.ForEach;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1= new Employee(1, "bhavna", "indore");
		Employee e2 = new Employee(2, "sonali", "indore");
		
		
		ArrayList list= new ArrayList();
		list.add(e1);
		list.add(e2);
		
		
		Employee e =(Employee) list.get(0);
		System.out.println(e);
		//System.out.println(e.getId());
		//System.out.println(e.getName());
		//System.out.println(e.getAddrese());
		
		
//		for (int i = 0; i < list.size(); i++) {
//			Employee  e3 = (Employee) list.get(i);
//			System.out.println(e3);
//			
		//}
		
//		for (Object object : list) {
//			Employee  e4 = (Employee) object;
//			System.out.println(e4);
//			
//		}
		
	//	Iterator it = list.iterator();
	//	while(it.hasNext()) {
//			Employee  e5 = (Employee) it.next();
//			System.out.println(e5);
//		}
		}
	}

