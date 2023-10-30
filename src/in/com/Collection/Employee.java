package in.com.Collection;

public class Employee {
 private  int id =0;
 private String name =null;
 private String addrese = null;
 
 
 public Employee (int id,String name, String addrese) {
	 this.id = id;
	 this.name= name;
	 this.addrese = addrese;
 }
	 
	 public void setId(int id) {
		 this.id = id; 
}
	 public int getId() {
		 return id;
	 }
	 public void setName(String name) {
		 this.name= name;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setAddrese(String addrese) {
		 this.addrese = addrese;
}
	 public String getAddrese() {
		 return addrese;
	 }
	 @Override
		public String toString() {
		 
		return id + " " + name + " " +	addrese ;
}
}
