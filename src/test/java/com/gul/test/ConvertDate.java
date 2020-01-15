package com.gul.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;

public class ConvertDate {
	public static void main(String[] args) {
//			Date date = new Date();
//			System.out.println(date.getDate());
			
//			Calendar cal = Calendar.getInstance();
//			Date today = cal.getTime();
//			cal.add(Calendar.YEAR, 1); // to get previous year add -1
//			Date nextYear = cal.getTime();
//			System.out.println(nextYear.getTime());
			
			
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 1);
		Date nextYear = cal.getTime();
		Date sdate = new Date();
		Long endTime =  nextYear.getTime();
		Long startTime =  sdate.getTime();
		System.out.println(sdate.getTime()+" ::::: "+nextYear.getTime());
	}
}
