package javaStudy.part09.exam03;

public class ExceptionExam3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0; 
		try {
		int k = divide(i,j);
		System.out.println(k);
		} catch (IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException {
		if (j == 0) {
//			System.out.println("2번째 매개변수는 0이면 안됩니다."); //2번째 매개변수가 0이면 예외가 발생하므로 미리 방지
//			return 0; //k=0으로 반환되면 연산 결과를 잘못 생각할 수 있으므로 문제 발생
			throw new IllegalArgumentException("0으로 나눌 수 없습니다."); //해당 라인에서 오류 발생
		}
		int k = i/ j;
		return k;
	}

}
