package OopsPractical;

import java.util.Scanner;

public class shape_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape ();
		//System.out.println(s1.getBorderWidth());
		//System.out.println(s1.getColor());
		
		Shape s2 = new Shape();
		s2.SetColor("black");
		s2.setBorderWidth(100);
		System.out.println(s2.getColor());
		System.out.println(s2.getBorderWidth() );


	}

}
