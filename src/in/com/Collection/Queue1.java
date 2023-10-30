package in.com.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		Queue<Integer> num =new PriorityQueue<Integer>(Comparator.reverseOrder());
		num.add(50);
		num.add(78);
		num.add(67);
		num.add(435);
		System.out.println(num);
		num.offer(45);                  //jo bhi numbre lege add kr ke dega
		System.out.println(num);
		
		System.out.println(num.peek());      //first wala number lega
		
		num.poll();
		System.out.println(num);            //peek me jonum liya vo hatjayega
		
		num.remove();
		System.out.println(num);             //1 ber me ek hi number remove hoga
	
		num.clear();
		System.out.println(num);
	}

}
