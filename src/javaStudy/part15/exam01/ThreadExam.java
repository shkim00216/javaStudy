package javaStudy.part15.exam01;

public class ThreadExam {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		t1.start();
		t2.start(); //호출 시 run이 아니라 start임
		
		System.out.println("main end !!");
	}

}
