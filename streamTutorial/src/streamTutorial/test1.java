package streamTutorial;

import java.util.ArrayList;

import org.junit.Test;

public class test1 {
	public void regular()
	{
	ArrayList<String> names = new ArrayList<String>();
	names.add("Riti");
	names.add("Ritu");
	names.add("Sandy");
	names.add("Saurabh");
	names.add("Sunny");
	int count =0;
	
	for(int i =0; i <names.size();i++) {
		String actual = names.get(i);
		if(actual.startsWith("R")) {
			count++;
		}
	}
	System.out.println(count);
	}
	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Riti");
		names.add("Ritu");
		names.add("Sandy");
		names.add("Saurabh");
		names.add("Sunny");
		names.stream().filter(s->s.startsWith("R")).count();
	}

}
