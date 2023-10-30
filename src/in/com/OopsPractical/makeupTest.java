package in.com.OopsPractical;

public class makeupTest {
	public static void main(String[] args) {
		Makeup m =new Makeup();
		m.lipsticColor = "pink";
		m.price =300;
		m.company = "mamaearth";
		m.printlipsticColor();
		m.printPrice();
		m.printCompany(); 
		
		Makeup m1 = new Makeup();
		m1.lipsticColor = "red";
		m1.price = 600;
		m1.company = "lakme";
		m1.printlipsticColor();
		m1.printPrice();
		m1.printCompany();
		
	}

}
