package in.com.ListApi;

public class AutoBoxing {
	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer (a);    //autoboxing- perimitive data type ko wrapme change krana
		System.out.println(a);      
		System.out.println(b);
		
		Integer c = new Integer (100);   //unboxing- wrappe ko primitive data type me change krna
		
		int d = c;
		System.out.println(c);
		System.out.println(d);
		
		
		
		
		
	}

}
