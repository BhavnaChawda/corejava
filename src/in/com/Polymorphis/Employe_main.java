package in.com.Polymorphis;
 class Employe {
	 void Showdetail() {
		System.out.println("this is employ detail");
	
	}                                            //overriding-same name same parameter but diffent logic 
	 void Showdetail(String name) {
		 System.out.println(name);
	 }
	 
 }
class Devloper extends Employe{
		 void Showdetail() {
			 super.Showdetail();
			System.out.println("this is Devloper Detail");
		}
		 void Showdetail(String name) {
			 super.Showdetail("ram");
			System.out.println(name);
		}
	}



public class Employe_main {
	public static void main(String[] args) {
	Employe e1;
	e1= new Devloper();
	e1.Showdetail();
	e1.Showdetail("sham");
	}

}
