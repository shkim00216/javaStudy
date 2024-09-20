package javaStudy.part15.exam05;

public class JoinExam {

	public static void main(String[] args) {
		MyThread5 thread5 = new MyThread5();
		
		thread5.start();
		
		System.out.println("시작");
		
		try {
			thread5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("종료!");
	}

}
