package in.com.FinallyException;

public class TestUserExeption {
	public static void main(String[] args) {
		String name = "bhavna";
		if (name.equals("bhavi")) {
			System.out.println("plz enter the valid syntex");
			
		}
		else {
			
			try {
			 UserException u = new UserException ();
				throw u ;
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
