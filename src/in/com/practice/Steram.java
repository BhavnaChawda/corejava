package in.com.practice;

import java.util.List;
import java.util.stream.Collectors;

public class Steram {
	public static void main(String[] args) {
		List<String> name = List.of("sonali", "sonu", "soniya","bhavna","manju","pramila");
		List<String>newname = name.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
		System.out.println(newname);
		
		List<Integer>num1 = List.of(1,2,3,4,5,6,7);
		
		List<Integer>naam = num1.stream().distinct().collect(Collectors.toList());
		System.out.println(naam);
		
		
		List<Integer>num = List.of(1,2,3,4,5);
		List<Integer>Square = num.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(Square);
	}

}
