package Polymorphis;

public class StudentDetial {
	public  void read() {        //compile time pollymorphism
		System.out.println("student reading book");
	}
   public  void read(String bookname) {
		System.out.println("this is a book name");
		System.out.println(bookname);
	}
     public void read(String Writer,int page) {
    	 System.out.println(Writer);
    	 System.out.println(page);
    }
     public void read1(String language) {
    	 System.out.println(language);
     }

}
