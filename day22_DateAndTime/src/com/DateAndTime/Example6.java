package com.DateAndTime;

//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
//import java.time.ZonedDateTime;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime d=LocalTime.now(ZoneId.of("America/Puerto_Rico"));
		LocalDateTime df=LocalDateTime.now(ZoneId.of("America/Puerto_Rico"));
		System.out.println(d);
		System.out.println(df);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
