  package in.com.FinallyException;

public class TestLoginException {
	public static void main(String[] args) {
		String name ="admin";
		if (name.equals("admi")) {
			System.out.println("yes valid user");
			
		}
		else {
			loginException a = new loginException();
			try {
				throw a ;
				
			} catch (loginException e) {
				System.out.println(e);
			}
		}
	}

}
