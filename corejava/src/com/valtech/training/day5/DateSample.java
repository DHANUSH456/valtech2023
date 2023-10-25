package com.valtech.training.day5;

import java.time.*;
import java.util.*;

public class DateSample {

	public static void main(String[] args) {

		@SuppressWarnings("deprecation")
		Date date = new Date(47, 7, 15);
		System.out.println(date);
		
		LocalDate independenceDay = LocalDate.of(1947, 8, 15);
		System.out.println(independenceDay);
	}

}
