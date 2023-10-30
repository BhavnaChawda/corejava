package in.com.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class VectorEmp_testClass {
public static void main(String[] args) {
	ArrayList<VectorEmployee > e1 = new ArrayList<VectorEmployee>();
	
	e1.add(new VectorEmployee(1, "bhavna", "879864"));
	e1.add(new VectorEmployee(8, "bhavika", "879987"));
	e1.add(new VectorEmployee(9, "bhavi", "4358798"));
	e1.add(new VectorEmployee(5, "bhanu", "876987"));
	e1.add(new VectorEmployee(7, "sonali", "8828765"));
	
	System.out.println(e1);
	
	Collections.sort(e1);
	
	System.out.println(e1);
	

}
		

}
