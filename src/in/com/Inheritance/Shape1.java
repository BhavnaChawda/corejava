package in.com.Inheritance;

public class Shape1 {
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
	public void area () {
		System.out.println("this is  area method" );
	}

}
