package in.com.TypeCasting;

public class TypeCasting1 {
	public static void main(String[] args) {
		//Data type
		//byte
		//short
		//int
		//long
		//float
		//double
		//implicit (small data type change to big data type
		int a=18;
		double b=a;
		System.out.println(b);
		//expict  (big data type change to small data type
		double c=10.0;
		int d= (int) c;
		System.out.println(d);
		short e=12;
		double f=e;
		System.out.println(f);
		double g =15.0;
		long h=(long) g;
		System.out.println(h);
		float i=25;
		double j=i;
		System.out.println(j);
		double k=78.0;
		float l =(float) k;
		System.out.println(l);
		long m=32;
		float n=m;
		System.out.println(n);
		float o=12;
		long p=(long) o;
	}

}
