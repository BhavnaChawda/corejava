package in.com.Cloning;

public class SallowCloningAccount implements Cloneable  {
int balance ;
   public SallowCloningAccount(int balance) {
	this.balance = balance;
	
}
   @Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
		
	}


