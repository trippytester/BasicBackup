package assignmentcol2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateF 
{
	public static void main(String[] args)
	{
		
		LocalDate ld1=LocalDate.now();
		LocalDate ld2 = ld1.plusDays(50);
		DateTimeFormatter date1=DateTimeFormatter.ofPattern("dd MMM yy");
		String s21=date1.format(ld1);
		System.out.println(s21);
		System.out.println(ld1);
		System.out.println(date1.format(ld1));
		System.out.println(date1.format(ld2));
	}
	
}
