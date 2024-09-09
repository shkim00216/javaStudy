package javaStudy.part09.exam02;

public class ExecptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = divide(i,j);
		System.out.println(k);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	public static int divide(int i, int j) throws ArithmeticException {
		int k = i/j;
		return k;
	} //divide 메소드는 예외가 발생하니 divide 메소드를 호출하는 쪽에서 처리하라고 떠넘김

}
