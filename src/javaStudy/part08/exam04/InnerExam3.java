package javaStudy.part08.exam04;

public class InnerExam3 {
	
	public void exec() {
		class Cal {
			int value = 0;
			public void plus() {
				value++;
			}
		}
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	} //지역 중첩 클래스
	
	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.exec();
	}

}
