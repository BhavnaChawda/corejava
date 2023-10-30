package in.com.practice;

import java.util.Comparator;

public class Employe1_phone implements Comparator<Employe1_main>{

	@Override
	public int compare(Employe1_main o1, Employe1_main o2) {
		if(o1.phone>o2.phone)
			return 1;
		else if(o1.phone<o2.phone)
			return -1;
		return 0;
	}

}
