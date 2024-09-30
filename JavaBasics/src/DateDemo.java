import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
	
		Date d = new Date();
		
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyy");
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
