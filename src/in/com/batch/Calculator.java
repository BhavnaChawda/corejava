package in.com.batch;

public class Calculator {
	public static void main(String[] args) {
		double num1 =22.00;
		double num2 =13.0;
		char operator ='*';
		double result;
		switch(operator) {
		case'*':
			result=num1*num2;
			System.out.println("multiply="+result);
			break;
			default:
	System.out.println("invalid operator");
				break;
		}
		
	}

}
