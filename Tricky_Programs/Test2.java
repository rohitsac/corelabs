import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Test2{
	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy G");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd G");

		// Date date = sdf1.parse("31/1/2016 AD");
		// Date date = sdf1.parse("32/1/2016 AD");
		// Date date = sdf1.parse("31/-1/2016 AD");
		Date date = sdf1.parse("31/1/-2016 AD");
		System.out.println(date);

		String s = sdf2.format(date);
		System.out.println(s);
	}	
}