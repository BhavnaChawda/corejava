package in.com.Cloning;

public class EmployD implements Cloneable {
	int salary1;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
