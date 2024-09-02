package javaStudy.part05.exam06;

public class StringMethodExam {

	public static void main(String[] args) {
//		String str = new String("hello");
		String str = "hello";
		System.out.println(str.length()); //공백도 하나의 문자라고 생각
		
		System.out.println(str.concat(" world"));
		System.out.println(str);
		
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 6));
	}

}
