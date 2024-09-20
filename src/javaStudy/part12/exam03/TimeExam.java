package javaStudy.part12.exam03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint); //현재 날짜와 시간
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ld1); //2012-12-12 날짜 객체 생성
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1); //17:18 시간 객체 생성
		
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2); //10:15:30 시간 객체 생성
		
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate); //2024-09-20 현재 날짜 출력
		System.out.println(timePoint.getMonthValue()); //9 현재 월 출력(+1을 하지 않아도 제대로 된 월 출력)
		System.out.println(timePoint.getMonth()); //SEPTEMBER 출력
		System.out.println(timePoint.getHour()); //13 현재 시 출력
	}

}
