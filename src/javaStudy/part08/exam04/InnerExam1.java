package javaStudy.part08.exam04;

public class InnerExam1 {
	class Cal {
		int value = 0;
		public void plus() {
			value++;
		}
	} //중첩 클래스
	
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal cal = t.new Cal();
		
		cal.plus();
		System.out.println(cal.value);
	}

}
