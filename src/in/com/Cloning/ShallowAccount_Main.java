package in.com.Cloning;

public class ShallowAccount_Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		SallowCloningAccount s1 = new SallowCloningAccount (112);
		SallowCloningAccount s2 =  (SallowCloningAccount) s1.clone();
		s2.balance =445;
		System.out.println(s1.balance);
		System.out.println(s2.balance);
	}

}
