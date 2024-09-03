package javaStudy.part08.exam03;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	default int exec(int i, int j) {
		return i + j;
	} //default 키워드 이용 시 인터페이스에서도 구현 가능
	
	public static int exec2(int i, int j) {
		return i * j;
	} //static 메소드 선언(유틸리티성 인터페이스)
}
