package in.com.Polymorphis;

public class Rectangle {
	private int length;
	private int width;
	
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
		
	}
	public void area() {
		int Rarea = getLength()*getWidth();
		System.out.println(Rarea);
	}

}
