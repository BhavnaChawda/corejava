package in.com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import in.com.Comparator.Comparatorbyname;

public class Employee_main {
	


	public static void main(String[] args) {
	List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee (7,"bhavna",357678));
		e.add(new Employee(6,"sonali",998765));
		e.add(new Employee(5,"rupali",98764));
		e.add(new Employee(4,"purva",76436));
		
		System.out.println(e);
		
		Collections.sort(e,new Employeeby_name());
		System.out.println(e);
		
		
		Collections.sort(e,new Employeeby_Id());
		System.out.println(e);
		
		Collections.sort(e,new Employeeby_phone());
		System.out.println(e);
		
	}

}
