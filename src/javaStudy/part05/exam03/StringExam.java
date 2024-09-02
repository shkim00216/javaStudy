package javaStudy.part05.exam03;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello"; //상수형 값이 만들어짐
		String str2 = "hello"; //str1과 str2는 같은 인스턴스를 참조함
		
		String str3 = new String("hello"); //new : 상수 영역에 있는 것을 참조하지 않고 새로 만들어짐
		String str4 = new String("hello");
		
		if(str1 == str2) { //true
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		}
		
		if(str1 == str4) { //false
			System.out.println("str1과 str3은 같은 레퍼런스입니다.");
		}
		
		if(str3 == str4) { //false
			System.out.println("str3과 str4은 같은 레퍼런스입니다.");
		}
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3)); //index 3번부터 출력됨 | substring(n) : n번째 index부터 문자열을 자른 결과를 반환하는 메소드
		
		System.out.println(str1); //String이 한번 가지고 있는 값은 변하지 않음
	}
}
