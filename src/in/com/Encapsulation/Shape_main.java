package in.com.Encapsulation;

public class Shape_main {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setBorderwidth(45);
		s.setColor("black");
		
	System.out.println(s.getBorderwidth());
	System.out.println(s.getColor());
	}

}
