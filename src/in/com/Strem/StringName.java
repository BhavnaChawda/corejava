package in.com.Strem;

import java.util.List;
import java.util.stream.Collectors;

public class StringName {
	public static void main(String[] args) {
 List<String>name = List.of("ram","radha","radhika","rohit","ruchi","shavi","sonali","bhavna");
	
 List<String>newname = name.stream().filter(e->e.startsWith("r")).collect(Collectors.toList());
 
 
 System.out.println(newname);
 
 
 
 List<Integer>num1 = List.of(1,3,2,4,5,5,6,2,7);
	
 List<Integer>newnum1 = num1.stream().distinct().collect(Collectors.toList());
 

 System.out.println(newnum1);
 
 
 
 List<Integer>num2 = List.of(1,3,2,4,5,5,6,2,7);
	
 List<Integer>Square = num2.stream().map(i->i*i).collect(Collectors.toList());
 
 System.out.println(Square);
 
 
 
 
	}

}
