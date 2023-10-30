package in.com.ExceptionTest;

public class Exception_Handling {
	public static void main(String[] args) {
		int a= 10;
		int b= 0;
		int c;
		String name ="sonali";
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
		
		try {
			
		} finally {
			System.out.println("ye to chalega hi");
		}
	}

}
