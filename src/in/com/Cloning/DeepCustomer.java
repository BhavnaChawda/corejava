package in.com.Cloning;

public class DeepCustomer  implements Cloneable {
	String name = null;
	//int balance;
	DeepCloningAccount a = new DeepCloningAccount();
	public DeepCustomer(String name,int balance) {
		this.name = name;
		this.a.balance = balance;
	}
	
@Override
protected Object clone() throws CloneNotSupportedException {
	DeepCustomer c = (DeepCustomer) super.clone();
	c.a= (DeepCloningAccount) a.clone();
	return c ;
}
}
