package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeTest {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.of(1998, 06, 16, 6, 20);
		System.out.println("My Date Of Birth:: "+dt);
		
		LocalDate today = LocalDate.now();
		
		LocalDate dob = LocalDate.of(1998, 06, 16);
		
		Period age = Period.between(today, dob);
		
		System.out.println(age);
		System.out.printf("My Age is %d years %d months and days"+age.getYears(),age.getMonths(),age.getDays());
		System.out.println();
		
		Year year = Year.parse("1998");
		System.out.println(year);
		
		
		Set<String> id = ZoneId.getAvailableZoneIds();
		
		System.out.println(id);
		
		LocalTime time = LocalTime.now(ZoneId.of("America/Indiana/Indianapolis"));
		System.out.println(time);
		
	}

}
