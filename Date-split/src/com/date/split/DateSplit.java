package com.date.split;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSplit {
	public static void main(String args[]) {

		Date date = new Date();
		String res = date.toString();
		String month = res.substring(4, 7);
		String day = res.substring(8, 10);

		int dayLastValue = Integer.parseInt(res.substring(9, 10));
		
		if (dayLastValue >= 4 || dayLastValue == 0) {
			System.out.println(month + " " + day + "th");
		} else if (dayLastValue == 1) {
			System.out.println(month + " " + day + "st");
		} else if (dayLastValue == 2) {
			System.out.println(month + " " + day + "nd");
		} else if (dayLastValue == 3) {
			System.out.println(month + " " + day + "rd");
		}
		
		System.out.println("===========================================================================");
		
		
		
		Date curDate = new Date();

		SimpleDateFormat format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		String DateToStr = format.format(curDate);
		
		try {
			Date strToDate = format.parse(DateToStr);
			String res1 = strToDate.toString();
			String month1 = res1.substring(4, 7);
			String day1 = res1.substring(8, 10);

			int dayLastValue1 = Integer.parseInt(res.substring(9, 10));
			
			if (dayLastValue1 >= 4 || dayLastValue1 == 0) {
				System.out.println(month1 + " " + day1 + "th");
			} else if (dayLastValue1 == 1) {
				System.out.println(month1 + " " + day1 + "st");
			} else if (dayLastValue1 == 2) {
				System.out.println(month1 + " " + day1 + "nd");
			} else if (dayLastValue == 3) {
				System.out.println(month1 + " " + day1 + "rd");
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
