package Inheritance;

class Bhavna {
	private String color ;
	private int borderwidth;
	 public void setColor(String color){
		this.color=color;
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
	    
	 public void Bhavna1() {
		 System.out.println(color);
		 System.out.println(borderwidth);
	 }
}

 class Rectangalyou extends Bhavna {
	int length;
	int width;
	public void setLength(int length){
		this.length=length;
	}
	 public int getLenth() {
		 return length;   
	 }
	 public void setWidth(int width) {
		 this.width = width;
	 }
	 public int getWidth() {
		 return width;
	 }
	 public void Bhavna2() {
		 System.out.println(length);
		 System.out.println(width);
	 }
	  
	
}
    public class Chawda_main{
    	public class Shape {

		}

		public static void main(String[] args) {
    		Rectangalyou r = new Rectangalyou();
    		r.setColor("black");
    		r.setBorderWidth(123);
    		r.setLength(12);
    		r.setWidth(56);
    		r.Bhavna1();
    		r.Bhavna2();
			
		}

    	
    }
