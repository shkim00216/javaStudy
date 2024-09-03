package javaStudy.part07.exam01;

import javaStudy.part07.exam02.AccessObj;

public class AccessObjExam {

	public static void main(String[] args) {
		//패키지 이동 후 오류생김
		AccessObj obj = new AccessObj();
		System.out.println(obj.p);
//		System.out.println(obj.p2); //컴파일 오류 - protected
//		System.out.println(obj.k); //컴파일 오류 - default
//		System.out.println(obj.i); //컴파일 오류 - private
	}

}
