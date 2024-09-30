import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBrushUp2 {

	public static void main(String[] args) {

		 int[] array = {1,2,3,4,5,6,7,8,10,122};
		
	   //print the values multiplied by 2,4,6,8,10,122
		 for(int i =0;i<array.length;i++) {
			 if(array[i] % 2 == 0) {
				 System.out.println(array[i]);
				 break;
			 }else {
				 System.out.println(array[i]  +  "is not multiple of 2");
			 }
		 }
		 
		 ArrayList<String> a = new ArrayList<String>();
		 //create object of class if u want to access the methods of the class
		 
		 a.add("ritu");
		 a.add("peetu");
		 a.add("cheetu");
		 a.add("seetu");
		 a.add("keetu");
		 a.remove(2); // remove index value
		 System.out.println(a.get(3)); //get the index value
		 
		for(int i =0 ; i <a.size();i++)
		{
			System.out.println(a.get(i));
		}
		 
		//enhanced for loop
		for(String val:a) {
			System.out.println(val);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
