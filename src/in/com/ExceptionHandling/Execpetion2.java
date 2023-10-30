package in.com.ExceptionHandling;

public class Execpetion2 {
	public static void main(String[] args) {
		int a = 19;
		int b =0;
		
		try {
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
