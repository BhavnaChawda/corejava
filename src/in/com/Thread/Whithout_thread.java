package in.com.Thread;

public class Whithout_thread {
	String name=null;
	public Whithout_thread (String name) {
		this.name = name;
	}
	public void run() {
		for (int i = 0; i <=10; i++) {
		System.out.println(name+ " " + i);	
		}
	}
	

}
