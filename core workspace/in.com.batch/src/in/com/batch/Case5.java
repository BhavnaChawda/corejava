package in.com.batch;

public class Case5 {
	public static void main(String[] args) {
StringBuffer sb= new StringBuffer("bhavna");
sb.append("chawda");
System.out.println(sb);
System.out.println(sb.capacity());
System.out.println(sb.length());
System.out.println(sb.charAt(1));
System.out.println(sb.indexOf("bhavna"));
System.out.println(sb.replace(0,1,"vna"));
System.out.println(sb.reverse());

	}

}
