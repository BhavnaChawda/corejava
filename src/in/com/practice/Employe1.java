package in.com.practice;

public class Employe1 {
	
	int id= 0;
	String name = null;
	int phone= 0;
	
	public Employe1(int id,String name,int phone) {
		this.id=id;
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		
		return id+" "+ name +" " + phone;
				}

	
	

}
