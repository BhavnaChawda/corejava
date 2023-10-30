package in.com.FinallyException;

public class FinallyE {
	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("ye to chalega hi chalega exception ho ki nhi ho!!!!!");
		}
		
	}

}
