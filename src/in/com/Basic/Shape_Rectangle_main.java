package in.com.Basic;

public class Shape_Rectangle_main {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.area();
	    r.Bhavna();
		
		
		Shape s = new Shape() {

			@Override
			public void area() {
			System.out.println("this is Shape area");
				
			}
			
	
			
	};

        s.Bhavna();
        s.area();
        
        
        Circle c = new Circle() {

			@Override
			public void area() {
		System.out.println("this is circle area");	
			}
        	
        };
        c.area();
        c.Bhavna();
	}
}
