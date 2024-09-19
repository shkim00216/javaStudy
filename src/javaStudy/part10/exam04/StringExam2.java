package javaStudy.part10.exam04;

public class StringExam2 {

	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1); //hello world
		System.out.println(str2); // world
		
		String str3 = str1 + str2;
		System.out.println(str3); //hello world world
		
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4); //hello world world
		
		String str5 = "";
		for (int i=0; i<100; i++) {
			str5 = str5 + "*";
		}
		System.out.println(str5); //100번 동안 내부적으로 StringBuffer 객체를 계속 만들어냄 -> new 연산자가 많이 사용될수록 프로그래밍 속도 저하
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<100; i++) {
			 sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6); //훨씬 효율적인 코드 사용
	}
}
