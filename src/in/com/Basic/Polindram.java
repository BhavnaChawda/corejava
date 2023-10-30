package in.com.Basic;

public class Polindram {
	public static void main (String[]args) {
		int num = 122;
		int sum=0;
		int rem;
		int tmp=0;
		tmp=num;
		
		while(num!=0) {
			
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(tmp==sum) {
			System.out.println("is polindram");
			
		}
		else
		System.out.println("is not polindram");
			
			
		}
		
	}


