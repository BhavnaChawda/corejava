package in.com.Array01;

import java.util.Scanner;

public class practic3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size :");
		int size =sc.nextInt();
		System.out.println("Enter the value :");
		int number[]=new int[size];
		for (int i = 0; i < size; i++) {
			number[i]= sc.nextInt();
			
		}
		System.out.println("Searching the element :");
		int s=sc.nextInt();
		for (int i = 0; i < size; i++) {
			
			System.out.println(number[i]);
			if(number[i]==s) {
				System.out.println(i);
			}
			
		}
		
	}
}
	


