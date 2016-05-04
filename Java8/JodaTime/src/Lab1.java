import java.time.*;

public class Lab1 {
	public static void main(String[] args) {

		System.out.println("-----  Date  -----");

		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int d = date.getDayOfMonth();
		int m = date.getMonthValue();
		
		int y = date.getYear();
		System.out.println(d+".."+m+".."+y);
		
		System.out.printf("\n%d-%d-%d", d, m, y);
		
		System.out.println("\n\n-----  Time  -----");
		
		LocalTime time = LocalTime.now();
		System.out.println(""+time);
		int h = time.getHour();
		m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.printf("\n%d:%d:%d:%d", h, m, s, n);
		
		System.out.println("\n\n-----  DateTime  -----");

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDateTime dt1 = LocalDateTime.of(1990, Month.APRIL, 28, 12, 45);
		System.out.println(dt1);
		
		LocalDateTime dt2 = LocalDateTime.of(1995, 04, 28, 12, 45);
		System.out.println(dt2);
		
		LocalDateTime dt3 = LocalDateTime.now();
		System.out.println("After six months : "+dt3.plusMonths(6));
		System.out.println("Before six months : "+dt3.minusMonths(6));
		
	//	Zone :
		ZoneId id = ZoneId.systemDefault();
		System.out.println(id);
		
	//	Custom Zoneid
		ZoneId cid = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(cid);
		System.out.println(zt);
		
	//	Period	Object
		LocalDate today = LocalDate.now();
		LocalDate bday = LocalDate.of(1992, 8, 2);
		
		Period p = Period.between(bday, today);
		System.out.println(p);
		
		System.out.printf("age is %d year %d months %d days", p.getYears(), p.getMonths(), p.getDays());
		
	}
}















