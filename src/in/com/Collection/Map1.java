package in.com.Collection;

import java.util.HashMap;
import java.util.Map;

public class Map1 {                     //map mt key and value
	public static void main(String[] args) {
		Map<String, Integer> num = new HashMap<String, Integer>();
		
		num.put("one", 1);
		num.put("two", 2);
		num.put("Three", 3);
		num.put("four", 4);
		
		
		System.out.println(num);
		
		
		System.out.println(num.containsKey("four"));
		
		System.out.println(num.containsValue(3));
		
		System.out.println(num.isEmpty());
		
		
		System.out.println(num.entrySet());
		
		System.out.println(num.get("two"));
		
		System.out.println(num.keySet());
		
		System.out.println(num.values());
		
		System.out.println(num.size());
		
		System.out.println();num.put("two", 2);
	}

}
