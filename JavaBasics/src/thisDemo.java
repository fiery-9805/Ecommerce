
public class thisDemo {
	
	
	int a = 2;
	public void getF()
	
	{
		
		int a =3;
		System.out.println(a);
		//this keyword refers to the current object and this object scope lies in class level
		System.out.println(this.a);
	}

	public static void main(String[] args) {
	  thisDemo td= new thisDemo();
	  td.getF();

	}

}
