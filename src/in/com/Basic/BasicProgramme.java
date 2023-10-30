package in.com.Basic;
import java.util.Scanner;

public class BasicProgramme {
public static void main (String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int rr = sc.nextInt();
	 int flage=0;
	for(int i=2; i<rr;i++)
	{
		if(rr %i==0) {
			flage=1;
		}
		
		
		
	}
	if(flage==0) {
		System.out.println(rr+"is prime number");
	}
	else {
		System.out.println("is not prime number"+rr);
	}
}
}

