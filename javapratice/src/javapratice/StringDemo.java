package javapratice;

public class StringDemo {

	public static void main(String[] args) {
		String s ="Heloo";
		String e = "Heloo";
		s.concat("world");//this will return the original string bcoz string is immutable as e is 
		                   //      also pointing to the heloo so u cant make changes in the string
		String c = s.concat("world");
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		sb.equals(s);
		sb.replace(1, 4, "gge");
		System.out.println(sb);
		sb.insert(2, "ee");
		System.out.println(sb);
		
		sb.substring(1, 6);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
