package in.com.OopsPractical;

import java.util.Scanner;

public class AtmCard {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=10000;
		int pin =3344;
		System.out.println("Enter the user name");
		String username=sc.next();
		System.out.println("Enter your pin");
		int u_pin=sc.nextInt();
		System.out.println("welcome to SBI ");
		System.out.println("!!!wlecome....."+username);
		int choice = 0;
		if(pin==u_pin) {
			
		
		do {
			System.out.println("1 Withdrow");
			System.out.println("2 Deposite");
			System.out.println("3 Check balance");
			System.out.println("4 Exit");
			System.out.println("Enter your choice");
	         choice =sc.nextInt();
			switch(choice){
			case 1:{
				System.out.println("withdrow amount");
				int withdrow = sc.nextInt();
				if (withdrow>balance) {
					System.out.println("insufficent balance");
				}else {
					System.out.println("succesfully withdrow amount");
					System.out.println("pleasr check withdrow");
				}
				break;
					
				}
			case 2:{
				System.out.println("Enter the Deposite amount");
				int dp= sc.nextInt();
				balance = balance+dp;
				System.out.println("succesfully deposite your amount");
				System.out.println("check amount");
				break;
			}
			case 3:{
				System.out.println("your balance....+balance");
				break;
			}
			case 4:{
				System.exit(0);
			}
			
			}
			
		} while (choice!=4); 
	}
		else {
			System.out.println("please check your pin");
		}
}
}
