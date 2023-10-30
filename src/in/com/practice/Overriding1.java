package in.com.practice;

 class Employe {
	 void showdetial() {
		 System.out.println("employe detial");
	 }
	 
	 void showdetial(String name) {
		 System.out.println(name);
	 } 
 }
 
 class Devloper extends Employe {
	 void showdetial () {
		 super.showdetial();
		 System.out.println("devloper detial");
	 }
	 void showdetial (String name) {
		 super.showdetial("rahul");
		 System.out.println(name);
	 }
	 
 }
 
public class Overriding1 {
	public static void main(String[] args) {
		Employe e1;
		e1= new Devloper();
		e1.showdetial();
		e1.showdetial("sonu");
	}

}
