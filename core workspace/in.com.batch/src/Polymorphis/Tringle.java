package Polymorphis;

public class Tringle extends Rectangle {
	private int length;
	private int height;
	public void getLength(int length) {
		this.length = length;
	}
	public int setLength() {
		return length;
	}
	public void getHeight(int height) {
		this.height = height;
	}
	public int setHeight() {
		return height;
	}
	public void area () {
		int tarea = getLength()*setHeight()/2;
		System.out.println(tarea);
		
	}

}
