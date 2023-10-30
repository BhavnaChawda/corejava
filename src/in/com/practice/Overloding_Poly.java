package in.com.practice;

public class Overloding_Poly {

	public void read() {
		System.out.println("read book");
	}
	public void read (String bookname) {
		System.out.println("this is a book name");
		System.out.println(bookname);
	}
	
	public void read(String writer ,int page) {
		System.out.println(writer);
		System.out.println(page);
	}
		public void read(int price,String language) {
			System.out.println(language);
			System.out.println(price);
			
		}
	}

