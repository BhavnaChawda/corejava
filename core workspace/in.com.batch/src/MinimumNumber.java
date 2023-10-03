
public class MinimumNumber {
	public static void main(String[] args) {
		int arr[]= {12,34,133,65,78,35};
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[1]<min) {
				min=arr[1];
				
			}
			
		}
		System.out.println(min);
	}

}
