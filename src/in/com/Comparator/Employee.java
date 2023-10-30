package in.com.Comparator;

public class Employee<Employee>{
			int Id;
			String name;
			String phone;
			
			public Employee(int Id,String name,String phone) {
				
			this.Id= Id;
			this.name = name;
			this.phone = phone;
			}
				
			
			@Override
			public String toString() {
				return Id+" " +name + " " +phone;
		}


//			@Override
//			public int compareTo(Employee o) {
//				if (this.Id>o.Id) 
//					return 1;
//					else if (this.Id<o.Id)
//						return -1;
//				
//				return 0;
//			}
//	   
	}

	


