package in.com.Basic;

public class LargestArray {
	
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,65,98,840,97};
		
		int a=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>a) {
				a=arr[i];
				
			}
			
			
		}
		System.out.println(a);
		
	}

}
