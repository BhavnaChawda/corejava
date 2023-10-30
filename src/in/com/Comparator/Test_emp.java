package in.com.Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test_emp {

public static void main(String[] args) {
	ArrayList<Employee> emp = new ArrayList<Employee>();
	emp.add(new Employee(2,"bhavna","123457"));
	emp.add(new Employee(1,"sonali","128987"));
	emp.add(new Employee(4,"monali","1265467"));
	emp.add(new Employee(8,"rupali","124764"));
	
	
	System.out.println(emp);

	
	Collections.sort(emp,new Comparatorbyname());
	System.out.println(emp);
	
	
}
}
