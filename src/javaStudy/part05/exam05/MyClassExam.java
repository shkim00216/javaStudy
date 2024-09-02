package javaStudy.part05.exam05;

public class MyClassExam {

	public static void main(String[] args) {
		MyClass myclass = new MyClass(); //메소드가 정의된 클래스 생성
		
		myclass.method1();
		
		myclass.method2(10);
		
		int value = myclass.method3();
		System.out.println("m3이 리턴한 값 " + value);
		
		myclass.method4(10, 100);
		
		int value2 = myclass.method5(50);
		System.out.println("m5가 리턴한 값: " + value2);
	}

}
