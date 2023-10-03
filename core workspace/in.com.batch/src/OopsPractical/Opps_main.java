package OopsPractical;

import java.util.Scanner;


public class Opps_main {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter Employ Name");
		String Employ=Sc.next();
		System.out.println("Enter salary");
		int Salary=Sc.nextInt();
		OppsProgram s2=new OppsProgram();
		s2.setEmploy(Employ);
		s2.setSalary(Salary);
		System.out.println("Employ Name : "+s2.getEmploy());
		System.out.println("Employ Salary : "+s2.getSalary());
		
		
	}

}
