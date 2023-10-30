package in.com.Collection;

public class Employee1 {
	private int id  = 0;
	private String name = null;
	private String add = null;
	
	
	public Employee1(int id,String name, String add) {
		this.id = id ;
		this.name= name;
		this.add = add;
		
	}
//	@Override
//	public String toString() {
//		
//		return id + " " + name + " " +add;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee1)) {
		return false;
	}
		Employee1 e = (Employee1) obj;
		boolean b = this.id == e.id && this.name == e.name && this.add==e.add;
		return b;
	}
	@Override
	public int hashCode() {
		String str = id +""+name+""+add;
		return str.hashCode();
	}
}
