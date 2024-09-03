package javaStudy.part07.exam01;

import javaStudy.part07.exam02.AccessObj;

public class AccessObjExam2 extends AccessObj {

	public static void main(String[] args) {
		//패키지 이동 후 상속관계 설정
		AccessObjExam2 obj = new AccessObjExam2();
		System.out.println(obj.p);
		System.out.println(obj.p2); //컴파일 완료 - 다른 패키지 안의 상속 관계
//		System.out.println(obj.k); //컴파일 오류 - default
//		System.out.println(obj.i); //컴파일 오류 - private
	}

}
