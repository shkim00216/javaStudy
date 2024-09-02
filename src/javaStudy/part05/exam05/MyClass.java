package javaStudy.part05.exam05;

public class MyClass {
//	public 리턴타입 메소드명 (매개변수들) {
		//기능 구현
//	}
	
	public void method1 () {
		System.out.println("m1이 실행됨..");
	} //매개변수X, 리턴값X
	
	public void method2 (int x) {
		System.out.println(x + "를 이용한 m2 실행");
	} //매개변수O, 리턴값X
	
	public int method3 () {
		System.out.println("m3 실행");
		
		return 10;
	} //매개변수X, 리턴값O
	
	public void method4 (int x, int y) {
		System.out.println(x + y + " m4 실행");
	} //매개변수2개, 리턴값X
	
	public int method5 (int y) {
		System.out.println(y + " 이용한 m5 실행");
		
		return y * 2;
	} //매개변수O, 리턴값O
}
