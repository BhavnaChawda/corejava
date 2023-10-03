package OopsPractical;

import java.util.Scanner;

public class Cloths_main {

	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the color");
    String Color =sc.next();
    System.out.println("Enter the type");
    String Type = sc.next();
    System.out.println("Enter the price");
    int Price = sc.nextInt();
    Cloths c = new Cloths();
    c.setColor(Color);
    c.setType(Type);
    c.setPrice(Price);
    System.out.println("Color :" +c.getColor());
    System.out.println("type :" +c.getType());
    System.out.println("price :" +c.getPrice());

	}

}
