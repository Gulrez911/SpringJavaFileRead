package com.gul.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AdYearDate {
	public static void main(String[] args) {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy hh:mm aa");
//		String currentDateString = "2017-09-12 00:00:00";
//		LocalDateTime dateTime = LocalDateTime.parse(currentDateString, formatter);
//		dateTime = dateTime.plusYears(10);
//		String tenYearsAfterString = dateTime.format(formatter);
//		System.out.println(tenYearsAfterString);
//		
		
//		Date today = cal.getTime();
		
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.YEAR, 1); // to get previous year add -1
//		Date nextYear = cal.getTime();
//		Date sdate = new Date();
//		DateFormat   formatter = new SimpleDateFormat("dd/MM/yyy hh:mm aa");
//		 String dd = formatter.format(nextYear);
//		 String dd2 = formatter.format(sdate);
//		System.out.println(dd+"\n"+dd2);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 1);
		Date nextYear = cal.getTime();
		Date sdate = new Date();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyy hh:mm aa");
		String startdate = formatter.format(sdate);
		String endDate = formatter.format(nextYear);
		System.out.println(">> "+startdate+">>> "+endDate);
		Date sDate = new Date(startdate);
		Date eDate = new Date(endDate);
		Long now = System.currentTimeMillis();
		Long start = sDate.getTime();
		System.out.println(">>. "+eDate+">> "+sDate);
	}
}
