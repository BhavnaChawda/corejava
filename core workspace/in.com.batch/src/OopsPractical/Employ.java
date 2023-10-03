package OopsPractical;

import java.util.Scanner;

public class Employ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter EmployId");
		String Employ=Sc.next();
		System.out.println("Enter MobailNumber");
		int MobailNumber=Sc.nextInt();
		EmployPractical s2=new EmployPractical();
		s2.setEmpolyId(Employ);
		s2.setMobailNumber(MobailNumber);
		System.out.println("EmployId" +s2.getEmployId());
		System.out.println("MobailNumber"+s2.getMobailNumber());

	}

}