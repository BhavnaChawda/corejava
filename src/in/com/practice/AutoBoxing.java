package in.com.practice;

public class AutoBoxing {
	public static void main(String[] args) {
		int a = 12;
		Integer b= new Integer(a);
		System.out.println(a);
		System.out.println(b);
		
		
		Integer c = new Integer (98);
		int d = c;
		System.out.println(d);
		System.out.println(c);
		
	}

}
