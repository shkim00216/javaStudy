package javaStudy.part14.exam01;

import java.lang.reflect.Method;

import javaStudy.Count100;

public class MyHelloExam {

	public static void main(String[] args) {
		MyHello hello = new MyHello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello"); //예외처리
			
			if (method.isAnnotationPresent(Count100.class)) {
				for (int i=0; i<100; i++) {
					hello.hello(); //hello 메서드가 @Count100 어노테이션이 설정되어 있을 경우, hello() 메서드 100번 호출
				} 
			} else {
				hello.hello();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
