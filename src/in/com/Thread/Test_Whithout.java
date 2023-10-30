package in.com.Thread;

public class Test_Whithout {
	public static void main(String[] args) {
		Whithout_thread w = new Whithout_thread("king");
		Whithout_thread w1 =new Whithout_thread("khohli");
		w.run();
		w1.run();

}

}