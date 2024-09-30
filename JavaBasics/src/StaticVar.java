
public class StaticVar {
	
	
	String name ;
	String address;
	static String city ="Banglore";
	
	
	StaticVar(String name , String address)//the scope of defined values will be i  the constructor only
	{
		this.name = name;
		this.address = address;
	
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	
	}
	
	
	

	public static void main(String[] args) {
		
		StaticVar sv = new StaticVar("BOB","Marthali");
		StaticVar sv1 = new StaticVar("Ritu","Jayanagar");
		sv.getAddress();
		sv1.getAddress();
		
		
		

	}

}
