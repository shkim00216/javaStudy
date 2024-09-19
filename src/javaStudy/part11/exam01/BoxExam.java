package javaStudy.part11.exam01;

public class BoxExam {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj(); //objcet의 후손이라면 무엇이든 받아들일 수 있음
//		
//		box.setObj("hello");
//		String str = (String)box.getObj(); //String 타입으로 변환
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
//		System.out.println(value);
		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
//		box2.setObj(3); //컴파일 오류 발생 -> int값이라
		box2.setObj("hello");
		String str = box2.getObj();
		System.out.println(str);
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
		System.out.println(v2);
	}

}
