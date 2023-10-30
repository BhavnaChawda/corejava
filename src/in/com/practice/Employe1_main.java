package in.com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employe1_main {

	int id= 0;
	String name = null;
	int phone= 0;
	
	public Employe1_main(int id,String name,int phone) {
		this.id=id;
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		
		return id+" "+ name +" " + phone;
				}

	public static void main(String[] args) {
		List<Employe1_main> e = new ArrayList<Employe1_main>();
		e.add(new Employe1_main(1,"prachi",93995641));
		e.add(new Employe1_main(9,"aachi",8719864));
		e.add(new Employe1_main(4,"ruchi",963063));
		e.add(new Employe1_main(3,"prachi",8817975));
		e.add(new Employe1_main(7,"radhika",6265902));
		
	//	System.out.println(e);
		
		Collections.sort(e,new  Employe1_name());
		System.out.println(e);
		
		Collections.sort(e,new Employe1_id());
		System.out.println(e);
		
		Collections.sort(e,new Employe1_phone());
		Iterator<Employe1_main>it=e.iterator();
		while(it.hasNext()) {
			Employe1_main e1=it.next();
					System.out.println(e1);
		}
		//System.out.println(e);
		
		
	}

}