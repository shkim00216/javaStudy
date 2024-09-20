package javaStudy.part15.exam02;

public class MyThread2 implements Runnable { //Runnable 인터페이스 구현(다른 클래스 상속 시에 사용 가능)
	
	String str;
	public MyThread2(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
