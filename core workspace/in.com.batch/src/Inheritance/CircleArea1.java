package Inheritance;

class Circle1{
	private String color;
	private int borderwidth;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setBorderWidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public int getBorderWidth() {
		return borderwidth;
	}
	public void bhavi() {
		System.out.println(color);
		System.out.println(borderwidth);
	}
	
}
 class Circle extends Circle1 {
	 private int radius;
	 private double PI= 3.14;
	 public void setRadius(int radius) {
		 this.radius = radius;
	 }
	 public int getRadius() {
		 return radius;
	 }
	 
	 public void bhavi1() {
		 double area = PI*getRadius()*getRadius();
		 System.out.println(area);
		 //System.out.println(PI);
	 
 }
 }


public class CircleArea1 {

	public static void main(String[] args) {
		Circle1 c1=new Circle1();
		c1.setBorderWidth(12);
		c1.setColor("red");
		c1.bhavi();
		Circle c = new Circle ();
		c.setRadius(10);
		c.bhavi1();
		
	}	

}
