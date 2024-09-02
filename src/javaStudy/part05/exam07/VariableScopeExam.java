package javaStudy.part05.exam07;

public class VariableScopeExam {
	
	int globalScope = 10; //이클립스 전체가 사용범위
	static int staticVal = 7; //static 변수 선언
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2 (int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope); //컴파일 에러
//		System.out.println(value); //컴파일 에러
		System.out.println(value2);
	}

	public static void main(String[] args) {
//		System.out.println(globalScope); //main 메서드 -> static : static 필드와 메서드 사용
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticVal);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 40;
	 	v2.globalScope = 20;
	 	System.out.println(v1.globalScope);
	 	System.out.println(v2.globalScope);
	 	
	 	v1.staticVal = 50;
	 	v2.staticVal = 100;
	 	System.out.println(v1.staticVal);
	 	System.out.println(v2.staticVal);
	 	
	 	System.out.println(VariableScopeExam.staticVal); //static 변수는 이렇게 사용하는 것이 바람직함
	}

}
