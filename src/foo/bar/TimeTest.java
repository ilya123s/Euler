package foo.bar;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TimeTest {

	public static void main(String args[]) {
		
		
		Date date = new Date(-15646549L);
		DateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS");
		String dateFormatted = formatter.format(date);
		System.out.println(dateFormatted);
		
		
	}
}
