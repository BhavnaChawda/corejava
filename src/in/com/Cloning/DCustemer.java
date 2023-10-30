package in.com.Cloning;

public class DCustemer implements Cloneable {
	String name ;
	DAccount d1 = new DAccount ();
	public DCustemer (String name,int balance) {
		this.name = name;
		this.d1.balance = balance;
	}
     @Override
    protected Object clone() throws CloneNotSupportedException {
    	 DCustemer d = (DCustemer) super.clone(); 
    	 d.d1 = (DAccount) d1.clone();
    	return d;
    }
}
