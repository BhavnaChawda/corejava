package in.com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Api {
	public static void main(String[] args) {
		List<Integer>a = new ArrayList<Integer>();
		a.add(654);
		a.add(986);
		a.add(675);
		a.add(765);
		
		System.out.println(a);
		
//		List<Integer> even = new ArrayList<Integer>();
//		for (Integer i : a) {
//			if (i%2==0) {
//			even.add(i);
//			}
//		}
//			System.out.println(even);
//
//		Stream<Integer> s = a.stream();
//		List<Integer> newList = s.filter(e-> e%2==0).collect(Collectors.toList());
//		System.out.println(newList);
		
		Stream<Integer> s = a.stream();
		List<Integer>newList = s.filter(e->e>675).collect(Collectors.toList());
		System.out.println(newList);
	}
}
