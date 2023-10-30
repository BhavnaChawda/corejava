package in.com.Cloning;

public class Account_Custemer_main {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCustomer m = new DeepCustomer("rahul" , 122);
		DeepCustomer n = (DeepCustomer) m.clone();
		n.name = "pramila";
	    n.a.balance = 143;
		System.out.println(m.a.balance);
		System.out.println(m.name);
		System.out.println(n.name);
		System.out.println(n.a.balance);
		
	}

}
