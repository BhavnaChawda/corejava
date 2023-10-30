package in.com.Cloning;

public class DAccount implements Cloneable {
	int balance;
	
   @Override
 protected Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}
