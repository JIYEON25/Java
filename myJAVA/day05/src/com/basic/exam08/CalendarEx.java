package com.basic.exam08;

import java.util.Calendar;

// Staic import문
import static java.lang.System.out;

/**
 * Calendar 클래스
 * 	- getInstance()로 객체를 생성하는 경우 : Singleton Pattern
 */
public class CalendarEx {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("CALENDAR ");
		
		// 객체 생성
		Calendar now = Calendar.getInstance();
		
		// 주차_1년 52주
		int week_yy = now.get(Calendar.WEEK_OF_YEAR);
		int yy = now.get(Calendar.YEAR);
		
		// 월_배열 : 1월이 0을 기억한다.
		int mm = now.get(Calendar.MONTH)+1;
		int dd = now.get(Calendar.DAY_OF_MONTH);
		
		sb.append(week_yy);
		sb.append("week ");
		sb.append(yy);
		sb.append("year ");
		sb.append(mm);
		sb.append("month ");
		sb.append(dd);
		sb.append("day");
		
		// System. 생략 : Static import 문 작성 시 가능
		out.println(sb.toString());
			/*
				CALENDAR 34week 2023year 8month 25day
			 */
	 }
}

