package OopsPractical;

import java.util.Scanner;

public class Bick_main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the color");
		String Color = sc.next();
		System.out.println("Enter the company");
		String Company = sc.next();
		System.out.println("Enter the mileage");
		int Mileage = sc.nextInt();
		System.out.println("Enter the type");
		String Type = sc.next();
		Bick b = new Bick();
		b.setColor(Color);
		b.setCompany(Company);
		b.setMileage(Mileage);
		b.setType(Type);
		System.out.println("color :" +b.getColor());
		System.out.println("company :"+b.getCompany());
		System.out.println("mileage :" +b.getMileage());
		System.out.println("type :" +b.getType());
	}

}
