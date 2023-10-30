package in.com.Abstract;
abstract class Olg{
	void disp(String name) {
		System.out.println("all features avileble"+name);
	}
	abstract void blutooth();
	abstract void ledquletity();
}
class Samsung extends Olg{
	
	void disp() {
		System.out.println("all  avileble");
	}
	@Override
	void blutooth() {
		System.out.println("blutooth hai");
		
	}

	@Override
	void ledquletity() {
		
		System.out.println("led yes");
		
	}
	
}

public class Lcd_main {

	public static void main(String[] args) {
		
		Olg	o = new Samsung();
		 o.disp("dev");
		 o.blutooth();
		 o.ledquletity();

	}

}
