package in.com.practice;

import java.util.Comparator;

public class Employeeby_Id implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id-o2.id;
	}
}
