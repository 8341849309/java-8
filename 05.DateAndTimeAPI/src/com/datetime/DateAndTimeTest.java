package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTimeTest {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		int days=date.getDayOfMonth();
		Month month=date.getMonth();
		int year=date.getYear();
		System.out.println(date);
		System.out.println("Days:: "+days+" Month:: "+month+" Year:: "+year);
		
		LocalTime time = LocalTime.now();
		int hour=time.getHour();
		int minute=time.getMinute();
		int secs=time.getSecond();
		System.out.println(time);
		System.out.println("Hours:: "+hour+" Minutes:: "+minute+" Seconds:: "+secs);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
	}

}
