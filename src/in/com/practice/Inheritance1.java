package in.com.practice;

class Shape{
	private int borderwidth = 0;
	private String color= null;
	
	public void setBorderWidth(int borderwidth) {
		this.borderwidth=borderwidth;
	}
	public int getBorderWidth() {
		return borderwidth;
	}
	
	public void setColor(String color) {
		this.color= color;
	}
	public String getColor() {
		return color;
	}
	
	public void sonali(){
		System.out.println(borderwidth);
		System.out.println(color);
		
	}	
}

 class Tringle extends Shape{
	 private int hight;
	 private int base;
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	 
	 public void area(){
		 int area = getBase()*getHight();
		 System.out.println(area); 
	 } 
 }
 
public class Inheritance1 {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setBorderWidth(30);
		s.setColor("red");
		s.sonali();
		
		Tringle t = new Tringle();
		t.setBase(12);
		t.setHight(13);
		t.area();
	}
}
