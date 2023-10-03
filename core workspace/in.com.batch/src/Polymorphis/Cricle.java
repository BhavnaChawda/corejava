package Polymorphis;

public class Cricle extends Rectangle {
	private int radius ;
	private double PI=3.14;
	 public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
//	public double getPI() {
	//	return PI;
	//}
	//public void setPI(double pI) {
	//	PI = pI;
	//}
//	}
	 public void Carea(){
		 double Carea = PI*getRadius()*getRadius();
		 System.out.println(Carea);
	 }

}
