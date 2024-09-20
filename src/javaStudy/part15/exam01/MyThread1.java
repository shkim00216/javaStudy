package javaStudy.part15.exam01;

public class MyThread1 extends Thread { //Thread 클래스 상속받음

	String str;
	public MyThread1 (String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int) (Math.random() * 1000)); //랜덤하게 몇 초 동안 쉬어라(컴퓨터가 너무 빨라 결과 확인 어려우므로)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} //다른 흐름의 main 메서드
	
}
