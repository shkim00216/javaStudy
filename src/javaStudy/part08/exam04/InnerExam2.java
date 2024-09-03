package javaStudy.part08.exam04;

public class InnerExam2 {
	static class Cal {
		int value = 0;
		public void plus() {
			value++;
		}
	} //정적 중첩 클래스
	
	public static void main(String[] args) {
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}
}
