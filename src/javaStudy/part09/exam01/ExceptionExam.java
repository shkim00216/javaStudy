package javaStudy.part09.exam01;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 0; //0으로 바꾸면 exception 발생
		try {
		int k = i / j; //정수를 0으로 나누면 '예외' 발생
		System.out.println(k);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.: " + e.toString());
		} finally {
			System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행!!");
		}
		System.out.println("main end!!");
	}

}
