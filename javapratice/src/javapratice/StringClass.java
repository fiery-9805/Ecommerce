package javapratice;

public class StringClass {

	public static void main(String[] args) {
		
//		String a = "hello";
//		System.out.println(a.charAt(3));
//		System.out.println(a.indexOf("l"));
//		System.out.println(a.concat(" i am RITU"));
		
		String n = "madam";
		String newS = " ";
		//check if the given string is palindrome 
		
		for(int i = n.length()-1;i>=0;i--)
		{
			
			newS = newS + n.charAt(i);
		}
		System.out.println(newS);
		
		if(n==newS) 
		{
			System.out.println("The given string is paindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}


