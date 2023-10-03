package Inheritance;

public class Shape_Rectangal_main {
	public static void main(String[] args) {
		Rectangal r = new Rectangal();
		r.setLength(10);
		r.setWidth(15);
		r.setColor("black");
		r.setBorderWidth(1000);
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getColor());
		System.out.println(r.getBorderWidth());
	}

}
