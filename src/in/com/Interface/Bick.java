package in.com.Interface;

   interface SportBick {
	   public void mileage();
	   
	   public void yamaha();
	    
   }
    
   interface NormalBick{
	   public void average();
	   
	   public void Hero();
   }


public class Bick  implements SportBick ,NormalBick {
	public static void main(String[] args) {
		Bick b = new Bick();
		b.average();
		b.Hero();
		b.mileage();
		b.yamaha();
		
	}

	@Override
	public void average() {
	System.out.println(60);
		
	}

	@Override
	public void Hero() {
		System.out.println("honda");
		
	}

	@Override
	public void mileage() {
		System.out.println(70);
		
	}

	@Override
	public void yamaha() {
		System.out.println("sport bick");
		
	}

}
