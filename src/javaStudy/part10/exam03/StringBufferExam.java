package javaStudy.part10.exam03;

public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); //StringBuffer가 가지고 있는 메소드들은 대부분 자기 자신을 반환
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		if (sb2 == sb3) {
			System.out.println("sb2 == sb3");
		}
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		//메소드체이닝 : 자기 자신의 메소드를 호출하여 자기 자신의 값을 바꿔나가는 것
		System.out.println(str2);
	}
}
