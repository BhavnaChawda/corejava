package in.com.Array01;

import java.util.Scanner;

public class FindNumber {
public static void main (String[] args) {
	Scanner ram = new Scanner(System.in);
	int arr[]= {1,2,3,4,5,6,7};
	System.out.println("Search eiment:");
	int flag=0;
	int s = ram.nextInt();
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]==s) {
			flag=1;
			
			
		}
		
	}
	if (flag==1) {
		System.out.println("this number is present");
	}
	else {
		System.out.println("this number is not present");
	}

	
}
}
