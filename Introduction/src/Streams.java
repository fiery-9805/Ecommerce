import java.util.ArrayList;

public class Streams {
	//count the names starting with alphabet R in list
	
//public void regular() {
//	ArrayList<String> names = new ArrayList<String>();
//	names.add("Ritu");
//	names.add("Riti");
//	names.add("Sunny");
//	names.add("Sandy");
//	names.add("Saurabh");
//	int count =0;
//	for(int i =0;i<names.size();i++) {
//		String actual = names.get(i);
//		if(actual.startsWith("R")) {
//			count++;
//		}
//	}
//	System.out.println(count);
//	
//}

public void streamFilter() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Ritu");
	names.add("Riti");
	names.add("Sunny");
	names.add("Sandy");
	names.add("Saurabh");
	
	Long c = names.stream().filter(s->s.startsWith("R")).count();
	System.out.println(c);
	
	
	
	
	
}



}
