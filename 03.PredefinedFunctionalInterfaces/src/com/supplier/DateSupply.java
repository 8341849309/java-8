package com.supplier;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class DateSupply {

	public static void main(String[] args) {

		// It won't take any input but supplies required object
		Supplier<Date> date = () -> new Date(); 
		
		Consumer<Date> c = dt -> {
			System.out.println("Year:: "+dt.getYear());
			System.out.println("Month:: "+dt.getMonth());
			System.out.println("Date:: "+dt.getDate());
		};
		
		
		c.accept(date.get());
		
	}

}
