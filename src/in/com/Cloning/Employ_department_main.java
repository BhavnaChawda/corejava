package in.com.Cloning;

public class Employ_department_main {
public static void main(String[] args) throws CloneNotSupportedException {
	 Department d1 = new Department("bhavna", 550);
	 Department d2 = (Department) d1.clone();
	 d2.name = "sonali";
	 d2.e.salary1= 888;
	 System.out.println(d1.e.salary1);
	 System.out.println(d1.name);
	 System.out.println(d2.name);
	 System.out.println(d2.e.salary1);
}
}
