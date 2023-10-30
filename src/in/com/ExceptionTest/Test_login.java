package in.com.ExceptionTest;

public class Test_login {
	public static void main(String[] args) {
		String name = "sonu";
		
		if (name.equals("son")) {
			System.out.println("yes valid ");
				
		}
		else {
			Login_exception e = new Login_exception();
			try {
			throw e;	
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}

}
