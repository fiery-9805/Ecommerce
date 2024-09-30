
public class StringConceptBrushUp {

	public static void main(String[] args) {
     
		//String is an object 
		String s1 = "Ritu";
		String s2 = new String("Welcome");
		
		String s ="Rahul Shetty Academy";
		String [] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		
		System.out.println(splittedString[1].trim());
		
//		for(int i =0;i<s.length();i++) {
//			System.out.println(s.charAt(i));	
//		}
		
		//print string in reverse
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
