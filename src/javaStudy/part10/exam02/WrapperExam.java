package javaStudy.part10.exam02;

public class WrapperExam {

	public static void main(String[] args) {
		int i = 5; //기본형 타입 -> 객체X (필드와 메소드 사용 불가)
		Integer i2 = new Integer(5); //객체로 바꿔줌
			
		Integer i3 = 5; //문제없이 작동 가능(Auto Boxing : 자동으로 기본형 -> Integer 형태로 변환)
		
		int i4 = i3.intValue(); 
		
		int i5 = i3; //Auto unboxing : 자동으로 Integer 형태의 값을 기본형으로 변환
	}

}
