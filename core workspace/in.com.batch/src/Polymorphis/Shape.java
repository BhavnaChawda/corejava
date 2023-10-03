package Polymorphis;

public class Shape extends Rectangle {
	private String Color;
	private int borderwidth;
	public void setColor(String Color) {
		this.Color = Color;
	}
	public String getColor() {
		return Color;
	}
	public void setBorderWidth(int borderwidth) {
		this.borderwidth=borderwidth;
	}
	public int getBorderWidth() {
		return borderwidth;
		}
	public void area() {
		System.out.println("this is a area method");
	}
	}
	

