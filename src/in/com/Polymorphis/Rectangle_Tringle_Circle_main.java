package in.com.Polymorphis;

public class Rectangle_Tringle_Circle_main {
	public static void main(String[] args) {
	Rectangle[] r = new Rectangle[4];
	r[0] =  new Tringle();
	r[1] = new Cricle();
	r[2] = new Shape();
	r[3]= new Rectangle();
	
	Tringle t = (Tringle) r [0];
	t.setLength(10);
	t.getHeight(12);
	t.area();
	
	 Cricle c = (Cricle) r[1];
	 c.setRadius(10);
	 c.Carea();
	 
	 Shape s = (Shape) r[2];
	 s.setColor("pink");
	 s.setBorderWidth(15);
	 s.area();
	 
	 Rectangle p = r[3];
	 p.setLength(15);
	 p.setWidth(15);
	 p.area();
	}

}
