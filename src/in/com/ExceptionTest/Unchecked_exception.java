package in.com.ExceptionTest;

public class Unchecked_exception {
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		m2();
	}
	public static void m2() {
		try {
			m3();	
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
	public static void m3() {
		String name ="bhavna";
		System.out.println(name.charAt(9));
		

	}

}