package in.com.Collection;

public class Employee_Comparator {
	int id ;
	String name;
	String phone;
	
	public Employee_Comparator(int id ,String name,String phone) {
		this.id=id;
		this.name= name;
		this.phone= phone;
	}
	
	@Override
	public String toString() {
		
		return id+" " +name +" " +phone ;
	}

}
