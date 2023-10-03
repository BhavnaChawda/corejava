package in.com.batch;

public class Note {
	public static void main(String[] args) {
		double num1=1500.00;  
	    double num2 = 30.0;
	    char operator = '/';
	    double result;
	    switch(operator) {
	    case '/':
	    	result = num1/num2;
	    	System.out.println("div=" +result);
	    	break;
	    	default:
	    System.out.println("invalid operator");
	    	
	    }
	    
		
	}

}
