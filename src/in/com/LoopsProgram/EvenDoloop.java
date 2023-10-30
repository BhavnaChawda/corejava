package in.com.LoopsProgram;

public class EvenDoloop {
	public static void main(String[] args) {
		int i =10;
		do {
			if (i%2==0) {            //(i%2==1) odd number or (i%2!=0) odd number
				System.out.println(i);
				
			}
			i++;
			
		} while (i<100);
	}

}
