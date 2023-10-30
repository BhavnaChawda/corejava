package in.com.Collection;

public class VectorEmployee implements Comparable<VectorEmployee > {
	private int emId;
	private String name;
	private String phone;
	
	public VectorEmployee(int emId,String name,String phone) {
		this.emId = emId;
		this.name = name;
		this.phone = phone;
	}

//	@Override
//	public int compareTo(VectorEmployee o) {
//		
//		return this.emId-o.emId;
//	}
	
	
	@Override
	public int compareTo(VectorEmployee o) {
		if(this.emId<o.emId)
		return 1;
		
		else if (this.emId>o.emId)
			return -1;
		return 0;
	}
	@Override
	public String toString() {
		
	return emId + " " +name + " " +phone;
	}


	
	

}
