package javaStudy.part12.exam02;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1); //월은 0부터 시작함
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR)); //0~11시로 표시
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //0~24시로 표시
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5); //add메소드 이용하여 쉽게 날짜 계산 가능
		
		System.out.println(cal.get(Calendar.HOUR)); //0~11시로 표시
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //0~24시로 표시
	}

}
