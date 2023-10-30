package in.com.Cloning;

public class Account_C_main {
	public static void main(String[] args) throws CloneNotSupportedException {
		DCustemer n = new DCustemer ("bhavna", 1000);
		DCustemer n1 = (DCustemer) n.clone();
		n1.name= "bhavna2";
		n1.d1.balance = 123;
		
		
		System.out.println(n1.name);
		System.out.println(n1.d1.balance);
		
		
		System.out.println(n.name);
		System.out.println(n.d1.balance);
	}

}
