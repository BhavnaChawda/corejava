package in.com.practice;

import java.util.Comparator;

public class Employeeby_name  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
