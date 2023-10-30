package in.com.Cloning;

public class Department implements Cloneable {
	String name = null;
	EmployD e = new EmployD();
	//int salary1;
	public Department (String name,int salary1) {
		this.name = name;
		this.e.salary1 = salary1;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Department d = (Department) super.clone();
		d.e =(EmployD) e.clone();
		return d;
	}
	
	

}
