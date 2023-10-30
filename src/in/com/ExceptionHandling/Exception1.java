package in.com.ExceptionHandling;

public class Exception1 {
	public static void main(String[] args) {
	   try {
		String name = "shivni";
		System.out.println(name.charAt(11));
	} catch (Exception e) {
		System.out.println(e);
	}
	}

}
