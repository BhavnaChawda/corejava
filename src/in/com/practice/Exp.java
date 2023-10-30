package in.com.practice;

public class Exp {
	public static void main(String[] args) {
		int a= 10;
		int b= 0;
		int c;
		String name = "somali";
		try {
			c= a/b;
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println(name.charAt(9));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
