
public class Constructor {
	
	public Constructor() // will not return values and
	                     //names of constructor should be the class name
	
	{
	 System.out.println("I am in the constructor");
	}
     
	public Constructor(int a,int b)
	{
		 System.out.println("I am in the parameterized constructor");
	}
	
	public void getData()
	{
		System.out.println("I am a method");
	}
	public static void main(String[] args) {

           Constructor c = new Constructor(4,5); //this object goes and check that 
           //which constructor has 2 params and then runs it accordingly
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
