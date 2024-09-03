package javaStudy.part08.exam03;

public class MyCalTest {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		int j = Calculator.exec2(3, 4); //static 메소드 호출(인터페이스명.메소드 형식)
		System.out.println(j);
	}
}
