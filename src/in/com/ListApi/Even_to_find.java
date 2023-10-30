package in.com.ListApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Even_to_find {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		list.add(987);
		list.add(765);
		list.add(76);
		list.add(54);
		list.add(87);
		list.add(90);
		list.add(54);
		list.add(79);
		list.add(88);
		System.out.println(list);
		
		
		//List<Integer>evenlist = new ArrayList<Integer>();
		
//		for (Integer i : list) {
//			if (i%2==0) {
//				evenlist.add(i);
//			}
//			
//		}
//		System.out.println(evenlist);
		
//		Stream<Integer>Strem = list.stream();
//		List<Integer> newlist = Strem.filter(e->e%2==0).collect(Collectors.toList());
//		System.out.println(newlist);
		
		Stream<Integer>Strem = list.stream();
		List<Integer> newlist = Strem.filter(e->e>900).collect(Collectors.toList());
		System.out.println(newlist);
		
		
	}

}
