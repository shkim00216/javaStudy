package javaStudy.part15.exam05;

public class MyThread5 extends Thread {
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("MyThread5 : " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
