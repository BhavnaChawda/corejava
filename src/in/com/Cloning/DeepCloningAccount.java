package in.com.Cloning;

import in.com.batch.calendar;

public class DeepCloningAccount  implements Cloneable{
	int balance;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	}

