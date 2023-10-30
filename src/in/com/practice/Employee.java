package in.com.practice;

public class Employee implements Comparable<Employee>{
	int id = 0;
	String name=null;
	int phone = 0;
	
	public Employee(int id,String name,int phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		
		return id + " " + name + " " + phone ;
	}
	
	@Override
	public int compareTo(Employee o) {
		return 0;
	}
	
	
}
