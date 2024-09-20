package javaStudy.part15.exam02;

public class Thread2Exam {

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("*");
		MyThread2 t2 = new MyThread2("-");
		
		//start() 메서드를 호출하기 위해 Thread 클래스 객체 생성해줘야 함
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		System.out.println("!!!");
	}

}
