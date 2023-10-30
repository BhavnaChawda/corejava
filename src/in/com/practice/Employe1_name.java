package in.com.practice;

import java.util.Comparator;

public class Employe1_name implements Comparator<Employe1_main> {

	@Override
	public int compare(Employe1_main o1, Employe1_main o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
	

}
