package in.com.Inheritance;
class Tringle1{
	private int length;
	private int width;
	
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setWidht(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void sonali (){
		System.out.println(length);
	    System.out.println(width);
		
		
	}
}
 class Tringle2 extends Tringle1 {
	 private int base;
	 private int height;
	 
	 public void setBase(int base) {
		 this.base = base;
	 }
	 public int getBase() {
		 return base;
	 }
	 public void setHeight(int height) {
		 this.height = height;
	 }
	 public int getHeight() {
		 return height;
	 }
	 public void area() {
	int area = getBase()*getHeight()/2;	 
		 System.out.println(area);
	 }
	 
 }


public class Tringle {
	public static void main(String[] args) {
		Tringle1 t = new Tringle1();
		t.setLength(12);
		t.setWidht(30);
		t.sonali();
		Tringle2 t1 = new Tringle2 ();
		t1.setBase(13);
		t1.setHeight(22);
		t1.area();
		
	}


}