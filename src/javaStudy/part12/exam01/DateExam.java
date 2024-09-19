package javaStudy.part12.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
	
	public static void main(String[] args) {
		Date date = new Date(); //현재 시간과 날짜 정보를 Date 인스턴스가 가지게 됨
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(date));
		
		System.out.println(date.getTime()); //현재 시간을 Long값으로 구하는 방법
		//System이 가지고 있는 메소드 이용
		long today = System.currentTimeMillis();
		System.out.println(today);
		
		System.out.println(today - date.getTime()); //시간으로 연산도 가능
	}
}
