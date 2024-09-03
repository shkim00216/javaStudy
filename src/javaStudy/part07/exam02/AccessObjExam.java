package javaStudy.part07.exam02;

public class AccessObjExam {

	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.p);
		System.out.println(obj.p2);
		System.out.println(obj.k);
//		System.out.println(obj.i); //컴파일 오류 - private
	}

}
