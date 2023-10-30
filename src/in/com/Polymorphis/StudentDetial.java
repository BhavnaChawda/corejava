package in.com.Polymorphis;

public class StudentDetial {
	public  void read() {        //compile time pollymorphism = overloding
		System.out.println("student reading book");    //same name different parameter
	}
   public  void read(String bookname) {
		System.out.println("this is a book name");
		System.out.println(bookname);
	}
     public void read(String Writer,int page) {
    	 System.out.println(Writer);
    	 System.out.println(page);
    }
     public void read(int price,String language) {
    	 System.out.println(language);
    	 System.out.println(price);
    	 
     }

}
